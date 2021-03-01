package Preprocessing;
import java.text.BreakIterator;
import java.util.ArrayList ;


public class Tokens {
	
	ArrayList<String> tokens ;
	Corpus parentCorpus;
	Stopwords stopwords;

	
	public Tokens(Corpus corpus) {
		
		this.stopwords = corpus.stopwords;
		this.parentCorpus = corpus;
		this.tokens = this.tokenify();
		
		
		
	
	}

	public boolean isWordCharacter(Character ch) {
	    return Character.isLetter(ch) || Character.isDigit(ch);
	}

	
	
	
	public  ArrayList<String>  tokenify() {
		ArrayList<String> tokens = new ArrayList<String>();
	 
        if (this.parentCorpus.raw == null) {
            return tokens;
        }
        BreakIterator boundary = BreakIterator.getWordInstance();
        boundary.setText(this.parentCorpus.raw);
        int start = boundary.first();
        for (int end = boundary.next(); 
                end != BreakIterator.DONE;
                start = end, end = boundary.next()) {
            if (isWordCharacter(this.parentCorpus.raw.charAt(start))) {
                String word = 
                    new String(this.parentCorpus.raw.substring(start, end).toLowerCase()).intern();
                if (this.stopwords != null && this.stopwords.isStopword(word)) {
                    continue;
                }
                tokens.add(word);
            }
        }
       return tokens;
    } 
		
	public String toString() 
    { 
		StringBuilder sb = new StringBuilder();
		for (String s : this.tokens)
		{
			sb.append(this.parentCorpus.TokenPaddingStart);
		    sb.append(s);
		    sb.append(this.parentCorpus.TokenPaddingEnd);
		}
        return sb.toString(); 
    } 
	
} 


