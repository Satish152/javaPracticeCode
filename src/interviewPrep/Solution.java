
package interviewPrep;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'goodSegment' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY badNumbers
     *  2. INTEGER l
     *  3. INTEGER r
     */
	//range=3,48;
	//list=[17,22,9,45,60,19];
	

    public static int goodSegment(List<Integer> badNumbers, int l, int r) {
    // Write your code here
    int count =0;
    int good=0;
    Map<Integer[],Integer> map=new HashMap<Integer[],Integer>();
    int size=badNumbers.size();
    for(int j=l;j<r;j++){
         if(!badNumbers.contains(j)){
        	 good++;
         }else{
        	 break;
         }
    }
    Integer[] arr={l,r};
   map.put(arr,good);
   Set<Map.Entry<Integer[],Integer>> data=map.entrySet();
   for(Map.Entry<Integer[],Integer> value:data){
       System.out.println(value.getValue());
   }
   return good;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        List list=new LinkedList();
        list.add(5);
        list.add(25);
        list.add(17);
        list.add(13);
        Collections.sort(list);
        Result.goodSegment(list, 3, 6);
        Result.goodSegment(list, 8, 33);
        Result.goodSegment(list, 2, 10);
        }
}