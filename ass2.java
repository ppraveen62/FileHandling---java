package fileio;

import java.io.File;
import java.util.regex.Pattern;

//Write a Java program to get specific files by extensions from a specified folder.
public class ass2 {

	public static void main(String[] args) {
		File obj =new File("E://simplilearn//"); //giving a directory
		String [] file= obj.list();
		for (String x:file) {
			boolean sreach =x.endsWith(".txt");//here u can change extension
			if (sreach==true) {
				System.out.println(x);
			}
   
		}
		
	}

}
