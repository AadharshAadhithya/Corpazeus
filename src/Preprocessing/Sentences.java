package Preprocessing;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Locale;


public class Sentences {
	
	Corpus parentCorpus;
	ArrayList<String> sentences;

	public Sentences(Corpus corpus){ 
		
		this.parentCorpus = corpus;
		this.sentences = this.sentencify();				
	}
	
	
	public  ArrayList<String>  sentencify() {
		ArrayList<String> sents = new ArrayList<String>();
		
		BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.ENGLISH);
		String source = parentCorpus.raw ;
		iterator.setText(source);
		int start = iterator.first();
		for (int end = iterator.next();
		    end != BreakIterator.DONE;
		    start = end, end = iterator.next()) {
		  sents.add(source.substring(start,end));
		}
		
		
		return sents;
	}
	
	
	
	public String toString() 
    { 
		StringBuilder sb = new StringBuilder();
		for (String s : this.sentences)
		{
			sb.append(this.parentCorpus.SentencePaddingStart);
		    sb.append(s);
		    sb.append(this.parentCorpus.SentencePaddingEnd);
		}
        return sb.toString(); 
    } 
}
