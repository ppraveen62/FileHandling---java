package fileio;

import java.io.File;

//Write a Java program to check if a file or directory has read and write permission.
public class ass4 {

	
		public static void main(String[] args) {
			File obj =new File("E://simplilearn//Test3.doc");
			boolean sreach =obj.isFile();
			
			if (sreach==true){
				boolean read=obj.canRead();
			    boolean write= obj.canWrite();
			
			System.out.println("read :" +read);
			System.out.println("write :" +write);
			}
			else {
				System.out.println("file not exists");
			}
		
	}

}
