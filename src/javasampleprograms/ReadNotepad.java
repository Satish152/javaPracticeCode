package javasampleprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadNotepad {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		   FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\test.txt");
           Scanner scan=new Scanner(file);
           while(scan.hasNextLine()){
        	   System.out.println(scan.nextLine());
           }
           
           file.close();
	}

}
