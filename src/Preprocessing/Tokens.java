package Preprocessing;
import java.text.BreakIterator;
import java.util.ArrayList ;


public class Tokens {
	
	ArrayList<String> tokens ;
	String raw;
	Stopwords stopwords;

	
	public Tokens(Corpus corpus) {
		
		this.stopwords = corpus.stopwords;
		this.raw = corpus.raw;
		this.tokens = this.tokenify();
		
		
		
	
	}

	public boolean isWordCharacter(Character ch) {
	    return Character.isLetter(ch) || Character.isDigit(ch);
	}

	
	
	
	public  ArrayList<String>  tokenify() {
		ArrayList<String> tokens = new ArrayList<String>();
	 
        if (this.raw == null) {
            return tokens;
        }
        BreakIterator boundary = BreakIterator.getWordInstance();
        boundary.setText(this.raw);
        int start = boundary.first();
        for (int end = boundary.next(); 
                end != BreakIterator.DONE;
                start = end, end = boundary.next()) {
            if (isWordCharacter(this.raw.charAt(start))) {
                String word = 
                    new String(this.raw.substring(start, end).toLowerCase()).intern();
                if (this.stopwords != null && this.stopwords.isStopword(word)) {
                    continue;
                }
                tokens.add(word);
            }
        }
       return tokens;
    } 
		
		
	
} 


