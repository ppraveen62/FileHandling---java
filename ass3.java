package fileio;
//Write a Java program to check if a file or directory specified by pathname exists or not.

import java.io.File;



public class ass3 {

	public static void main(String[] args) {
		File obj =new File("E://simplilearn//Test3.doc"); //giving a file
		boolean sreach =obj.isFile();  //true since file exists
		System.out.println(sreach);
		
		File ob =new File("E://simplilearn"); //giving a directory
		boolean sreach1 =ob.isDirectory();  //true since exists
		System.out.println(sreach1);
	}


	}
