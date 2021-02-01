package Preprocessing;


import java.io.File;
import java.io.FileNotFoundException;



public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File newfile = new File("C:\\Users\\aadha\\Desktop\\trial.txt");
		
		String raw = Utils.readFile(newfile);
		System.out.println(raw);
		
	}

}
