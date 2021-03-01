package Preprocessing;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {
	
	public  static String readFile(File Corpus) throws FileNotFoundException {
		/*Takes in a FIle Object,and returns a Java.lang.String object containing the lines
		 * of the file.
		 */
		
		Scanner scan = new Scanner(Corpus,"UTF-8");//Using to scan each line of the file
		
		String raw = "";
		
		while(scan.hasNextLine()) {
			raw = raw.concat(scan.nextLine() + "\n"); //appends string , with each line of the corpus
		}
		
		scan.close();
		
		return raw;
	}
	
	//overloaded sentencify function , that takes in a Prerocessing.Corpus or Java.lang.String and returns a Preprocessing.Sentences object
	
	
}
