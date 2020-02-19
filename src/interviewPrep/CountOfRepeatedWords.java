package interviewPrep;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfRepeatedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String text="gecsdvdfsgvs";
            char[] arr=text.toCharArray();
            Map<Character, Integer> map=new HashMap<Character,Integer>();
            for(char ch:arr){
            	if(map.containsKey(ch)){
            		map.put(ch, map.get(ch)+1);
            	}else{
            		map.put(ch, 1);
            	}
            }
            Set<Character> ch=map.keySet();
            for(char values : map.keySet()){
            	if(map.get(values)>1){
            		System.out.println(values+" repeated "+map.get(values)+" times");
            	}
            }
	}

}
