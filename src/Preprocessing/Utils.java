package Preprocessing;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {
	
	public  String readFile(String path) throws FileNotFoundException {
		File Corpus = new File(path);
		Scanner scan = new Scanner(Corpus);
		
		String raw = "";
		
		while(scan.hasNextLine()) {
			raw = raw.concat(scan.nextLine() + "\n");
		}
		
		scan.close();
		
		return raw;
	}
	
}
