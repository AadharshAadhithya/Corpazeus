package Preprocessing;

import java.io.File;
import java.io.FileNotFoundException;

public class Corpus {
	public String raw;
	
	
	Corpus(String raw){
		// constructor for instantiating with a raw string of data
		this.raw = raw;
		
		
	}
	
	Corpus(File file){
		// constructor for intantiating with from a file
		try {
			this.raw = Utils.readFile(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
