package Preprocessing;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Locale;


public class Sentences  {
	String raw;
	ArrayList<String> sentences;

	public Sentences(Corpus corpus){ 
		this.raw = corpus.raw ; 
		this.sentences = this.sentencify();				
	}
	
	
	public  ArrayList<String>  sentencify() {
		ArrayList<String> sents = new ArrayList<String>();
		
		BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
		String source = this.raw ;
		iterator.setText(source);
		int start = iterator.first();
		for (int end = iterator.next();
		    end != BreakIterator.DONE;
		    start = end, end = iterator.next()) {
		  sents.add(source.substring(start,end));
		}
		
		return sents;
	}
}
