package fileio;

import java.io.File;

//Write a Java program to get file size in bytes, kb, mb.
public class ass8 {
	public static void main(String[] args) {
		File obj =new File("E://simplilearn//Test3.doc");
		boolean sreach =obj.isFile();
		
		if (sreach==true){
		System.out.println("size of file "+obj.length()+ " bytes.");
		}
		else {
			System.out.println("file not exists");
		}
	}
}
