package fileio;
import java.io.File;
//Write a Java program to get a list of all file/directory names from the given.
import java.util.*;

public class ass1 {

	public static void main(String[] args) {
		File obj =new File("E://sikmplilearn-//"); //giving a directory
		String [] file= obj.list();
		//Arrays.sort(file);
		//we are creating list array using list() method 
		for (String x:file) {     //Accessing list from each.
		System.out.println(x);
		}
	}

}
