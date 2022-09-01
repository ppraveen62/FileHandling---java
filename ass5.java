package fileio;
//5.Write a Java program to check if given pathname is a directory or a file.
import java.io.File;

public class ass5 {

	public static void main(String[] args) {
		File obj =new File("E://simplilearn//");
		boolean sreach1 =obj.isFile();
		boolean sreach2 =obj.isDirectory();
		if (sreach1==true){
			System.out.println("it is a file path");	
		}
		else if (sreach2==true) {
			System.out.println("it is a directory");
		}
		else {
			System.out.println("check path");
			
		}
		
	

	}

}
