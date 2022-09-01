package fileio;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//Write a Java program to append text to an existing file.
public class ass10 {
	public static void main(String[] args) throws IOException {
		
		
		FileWriter obj =new FileWriter("E://simplilearn//TestFile.txt",true);
		obj.write("hello buddy "); //true means append 
		obj.close();
		
		File ob =new File("E://simplilearn//TestFile.txt");
		Scanner Reader = new Scanner(ob);
		while (Reader.hasNextLine()) {
			String data = Reader.nextLine();
			System.out.println(data);
		}
		Reader.close();
	}
		
}
		