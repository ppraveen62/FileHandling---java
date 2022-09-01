package fileio;
//Write a Java program to read contents from a file into byte array

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class ass9 {
	public static void main(String[] args) throws IOException {
		File obj =new File("E://simplilearn//TestFile.txt");
		Scanner Reader = new Scanner(obj);
		while (Reader.hasNextLine()) {
			String data = Reader.nextLine();
			System.out.println(data);
		}
		Reader.close();

	}


}
