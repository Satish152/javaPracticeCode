package javasampleprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadLinesFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String text="this is Test1\nThis is Test2\nThis is Test3\nThis is Test4\nThis is Test5";
       Scanner scan=new Scanner(text);  //in new Scanner constructor you can pass String,file,System.in etc
       List<String> obj=new ArrayList<String>();
       while(scan.hasNextLine()){
    	   obj.add(scan.nextLine());
       }
       System.out.println(obj.size());
       for(int i=0;i<obj.size();i++){   //This will print the values in a list
    	   System.out.println(obj.get(i));
       }
       
       System.out.println();
       System.out.println();
       
       for(int k=obj.size()-1;k>=0;k--){  //This will print in reverse order of lines in a list
    	   System.out.println(obj.get(k));
       }
	}

}
