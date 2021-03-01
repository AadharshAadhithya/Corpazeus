package Preprocessing;

import java.io.File;
import java.io.FileNotFoundException;

public class Corpus extends Utils  {
	public String raw;
	Sentences sentences ;
	Tokens tokens;
	Stopwords stopwords; 
	int ntokens;
	int nsents;
	public String TokenPaddingStart = "<SOT>";
	public String TokenPaddingEnd = "<\\EOT> \n";
	public String SentencePaddingStart = "<SOS>";
	public String SentencePaddingEnd = "<\\EOS> \n";
	
	
	Corpus(String raw, String path) throws Exception{
		// constructor for instantiating with a raw string of data
		
		this.raw = raw;
		this.stopwords = new Stopwords(path);
		this.sentences =  new Sentences(this);
		this.tokens = new Tokens(this);
		this.ntokens = sentences.sentences.size();
		this.nsents = tokens.tokens.size();
		
		
		
		
	}
	
	Corpus(File file , String path) throws Exception{
		// constructor for intantiating with from a file
		try {
			this.raw = readFile(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.sentences =  new Sentences(this);
		this.stopwords = new Stopwords(path);
		this.tokens = new Tokens(this);
	}
	


}
