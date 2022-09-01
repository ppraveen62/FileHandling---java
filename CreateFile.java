import java.io.IOException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
public class CreateFile {

	public static void CreateFileUsingFileClass() throws IOException {
		File file=new File("E://simplilearn//TestFile.txt");
		
		//Create the file
		if(file.createNewFile()) {
			System.out.println("File is Created");
		}
		else {
			System.out.println("File already exists");
		}
		
	}
	public static void CreateFileUsingFileOutputStreamClass() throws IOException{
		String data="August weekdays folks are learning JAVA";
		FileOutputStream out=new FileOutputStream("E://simplilearn//Test3.doc");
		out.write(data.getBytes());
		out.close();
			
	}
	public static void CreateFileIn_NIO() throws IOException{
		String data="Hey Folks... We are learning File Handling";
		Files.write(Paths.get("E:/simplilearn/mynewfile.txt"),data.getBytes());
		List<String> lines=Arrays.asList("My First Line","My Second Line","My Third Line");
		Files.write(Paths.get("simple.txt"), lines, 
				StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CreateFileUsingFileClass();
		CreateFileUsingFileOutputStreamClass();
		CreateFileIn_NIO();
	}

}