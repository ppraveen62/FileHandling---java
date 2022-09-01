package fileio;

import java.io.File;
import java.util.Date;

//Write a Java program to get last modified time of a file.
public class ass7 {
	public static void main(String[] args) {
		File obj =new File("E://simplilearn//mynewfile.txt");
		Date date =new Date(obj.lastModified());
		System.out.println(date);
	}

}
