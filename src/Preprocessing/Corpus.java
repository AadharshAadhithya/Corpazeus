package Preprocessing;

import java.io.File;
import java.io.FileNotFoundException;

public class Corpus  {
	public String raw;
	Sentences sentences ;
	Tokens tokens;
	Stopwords stopwords; 
	
	
	Corpus(String raw, String path) throws Exception{
		// constructor for instantiating with a raw string of data
		this.raw = raw;
		this.sentences =  new Sentences(this);
		this.stopwords = new Stopwords(path);
		this.tokens = new Tokens(this);
		
		
		
	}
	
	Corpus(File file , String path) throws Exception{
		// constructor for intantiating with from a file
		try {
			this.raw = Utils.readFile(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.sentences =  new Sentences(this);
		this.stopwords = new Stopwords(path);
		this.tokens = new Tokens(this);
	}

}
