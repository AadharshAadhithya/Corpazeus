package Preprocessing;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {
	
	public  static String readFile(File Corpus) throws FileNotFoundException {
		
		Scanner scan = new Scanner(Corpus);//Using to scan each line of the file
		
		String raw = "";
		
		while(scan.hasNextLine()) {
			raw = raw.concat(scan.nextLine() + "\n"); //appends string , with each line of the corpus
		}
		
		scan.close();
		
		return raw;
	}
	
}
