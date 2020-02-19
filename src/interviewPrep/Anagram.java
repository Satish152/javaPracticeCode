package interviewPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              test("woman Hitler","Mother In Law");
	}
	
	public static void test(String str,String str2){
		int length=str.length();
		int len1=str2.length();
		str=str.replaceAll("[\\s]", "").toLowerCase();
		str2=str2.replaceAll("[\\s]", "").toLowerCase();
		System.out.println(str.length()+" "+str2.length());
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[] arr=str.toCharArray();
		for(char c:arr){
			 if(map.containsKey(c)){
				System.out.println("entered in to exist");
				map.put(c, map.get(c)+1);
			}else if(!map.containsKey(c)){
				map.put(c, 1);
				System.out.println("entered in to new");
			}
		}
		System.out.println(map.size());
  }
}
