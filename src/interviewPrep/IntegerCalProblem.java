package interviewPrep;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IntegerCalProblem {

	public static void main(String[] args) {
		String text="ta1s2te the th34under";
		String[] arr=text.split("[ ]");
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		for(int i=0;i<arr.length;i++){
			int add=0;
			if(arr[i].contains("t")){
			String value=arr[i].toString().replaceAll("[a-z]", "");
			char[] num=value.toCharArray();
			if(num.length!=0){
			for(char ch:num){
				add=add+Character.getNumericValue(ch);
			}
			}else{
				add=0;
			}
			map.put(arr[i], add);
		}else{
			add=0;
			map.put(arr[i], add);
		}		
		}
	  Set<Map.Entry<String, Integer>> obj=map.entrySet();
	  for(Map.Entry<String, Integer> value:obj){
		  System.out.println(value.getKey());
		  System.out.println(value.getValue());
	  }
	}
}
