package Preprocessing;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File newfile = new File("C:\\Users\\aadha\\Desktop\\trial.txt");
		
		String raw = Utils.readFile(newfile);
		Corpus cr = new Corpus(raw, "C:\\Users\\aadha\\Desktop\\stopwords.txt");
		System.out.println( cr.sentences.sentences);
		System.out.println( "------------------");
		System.out.println( cr.tokens.tokens);
		
		
	}

}