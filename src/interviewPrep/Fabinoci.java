package interviewPrep;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

public class Fabinoci extends Calc{

	public static void main(String[] args) {
		Fabinoci obj=new Fabinoci();
		// TODO Auto-generated method stub
       //Fabinoci.fabinoci(0, 1);
		//Fabinoci.PrimeNumber(25);
	   //Fabinoci.Prime(100);
		//Fabinoci.StringPalin("Satish");
		//Fabinoci.IntegerPalin(150);
		Fabinoci.strReplace();
		//Fabinoci.Armstrong(371);
		//Fabinoci.Factorial(8);
		//Fabinoci.ReverseString("Satish");
	/*	int[] values={10,20,20,30,30,40,50,50};
		
		Fabinoci.removeDuplicateElement(values, values.length);
		for(int i=0;i<values.length;i++){
			System.out.print(values[i]+" ");
		}*/
		
		//Fabinoci.Pattern();
		
		//Fabinoci.repeatedString("dfdsgssdasaf");
		
		//String[] arr={"satish","maggie","techm","testing"};
		//Fabinoci.ReverseArray(arr);
		
		//Fabinoci.leapYear(2012);
		//dateCalculator();
	}

	
	public static void fabinoci(int a,int b){
		System.out.print(a+" "+b+" ");
        for(int i=0;i<10;i++){
        	int temp=a+b;
        	a=b;
        	b=temp;
        	System.out.print(temp+" ");
        }
	}
	
	public static void PrimeNumber(int a){
		boolean prime=true;
		for(int i=2;i<a;i++){  //divide thr given number by the for loop int..
			if(a%i!=0){
				prime=true;
			}else{
				prime=false;
				break;
			}
		}
		if(prime){
			System.out.println(a+" is prime number");
		}else
		{
			System.out.println(a+" is not prime number");
		}
	}
	
	public static void Prime(int b){
		boolean prime=true;
		for(int i=2;i<b;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					prime=false;
					break;
				}else{
					prime=true;
				}
				}
			if(prime){
				System.out.print(i+" ");
			}
		}
	}
	
	public static void StringPalin(String text){
		String temp="";
		int length=text.length();
		for(int i=length-1;i>=0;i--){
			System.out.println(text.charAt(i));
			temp=temp+text.charAt(i);
		}
		if(temp.equals(text)){
			System.out.println(text+" is a palindrome String");
		}else{
			System.out.println(text+" is not a palindome String");
		}
	}
	
	public static void IntegerPalin(int number){
		int temp=number;
		int rev=0;
		for(int i=number;number>0;i++){
			int rem=number%10;
			number=number/10;
			rev=rev*10+rem;
		}
		System.out.println(rev+" rev number");
		if(rev==temp)
			System.out.println(temp +" is reverse number");
		else
			System.out.println(temp +" is not reverse number");
	}
	
	public static void Armstrong(int number){
		int temp=number;
		int rev=0;
		for(int i=number;number>0;i++){
			int rem=number%10;
			number=number/10;
			rev=rev+rem*rem*rem;
		}
		if(temp==rev)
			System.out.println(temp+" is a Armstrong number");
		else
			System.out.println(temp+" is not a Armstrong number");
	}
	
	public static void Factorial(int number){
		int temp=number;
		int fact=1;
		for(int i=1;i<=number;i++){
			fact=fact*i;
		}
		System.out.println("factorial of "+number+" is "+fact);
	}
	
	public static void ReverseString(String text){
		String temp="";
		for(int i=text.length()-1;i>=0;i--){
			temp=temp+text.charAt(i);
		}
		System.out.println(temp+" is reverse of string");
	}
	
	public static int removeDuplicateElement(int[] arr,int length){
		 if (length==0 || length==1){  
	            return length;  
	        } 
		int[] temp=new int[length];
		int j=0;
		for(int i=0;i<length-1;i++){
			if(arr[i]!=arr[i+1]){
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[length-1];
				for(int k=0;k<j;k++){
					arr[k]=temp[k];
				}
				return j;
	}
	
	public static void Pattern(){
		for(int i=1;i<5;i++){
			for(int j=0;j<i;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
	public static void repeatedString(String Text){
		
		int count=0;
		//one way to find the Duplicate charachters in a String
	/*	char[] arr=Text.toCharArray();
		for(int i=0;i<Text.length();i++){
			for(int j=i+1;j<Text.length();j++){
				if(arr[i]==arr[j]){
					count++;
					System.out.println(arr[j]+" "+count);
				}
			}
		} */
		
		//Second method to find the duplicate elements Count
		Map<Character,Integer> dupmap=new HashMap<Character,Integer>();
		char[] arr=Text.toCharArray();
		for(Character ch:arr){
			if(dupmap.containsKey(ch)){
				dupmap.put(ch, dupmap.get(ch)+1);
			}else{
				dupmap.put(ch, 1);
			}	
		}
		Set<Character> keys=dupmap.keySet();
		for(Character ch : keys){
			if(dupmap.get(ch)>1){
			//	System.out.println(ch+"  count "+dupmap.get(ch));  //this is for Count
				System.out.println(ch);   //This print only Character
				
			}
		}
	}
	
	public static void ReverseArray(String arr[]){
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
	
	public static void leapYear(int year){
		int result=year%4;
		if(result==0){
			System.out.println("this is a leap year");
		}else{
			System.out.println("this is not a leap year");
		}
	}
	
	public static void dateCalculator() throws ParseException{
		SimpleDateFormat format=new SimpleDateFormat("dd mm yyyy");
		String date1="21 04 1995";
		String date2="21 04 2019";
		Date birth=format.parse(date1);
		Date present=format.parse(date2);
		long diff=birth.getTime()- present.getTime();
		 System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
	}
	
	@SuppressWarnings("deprecation")
	public static void strReplace(){
		String amount="$0.34";
		amount=amount.replaceAll("[$]", "");
		System.out.println(amount);
	}
}
