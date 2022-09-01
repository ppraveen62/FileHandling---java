package fileio;

import java.io.File;

//Write a Java program to compare two files lexicographically.
public class ass6 {
	public static void main(String[] args) {
		File obj =new File("E://simplilearn//mynewfile.txt");
		File ob =new File("E://simplilearn//TestFile.txt");
		 if (obj.compareTo(ob) == 0) {
	         System.out.println("Both lexicographically equal");
	      } else {
	         System.out.println("Both lexicographically not equal");
	      }
		 System.out.println(obj.compareTo(ob));
		
	}
}
