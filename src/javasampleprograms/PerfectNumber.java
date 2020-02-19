package javasampleprograms;

import java.util.Scanner;


//Factorial of given number is equal to the same number enterd in called perfect number Eg : 28: 2*14 7*4 and for this we add 1
public class PerfectNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter any number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int temp=num;
	 boolean perfect= Perfect(num);
		if(perfect){
			System.out.println("Number is a perfect number");
		}
			else{
				System.out.println("number is not a perfect");
			}
		}
	public static boolean Perfect(int n){
		int sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				System.out.println(i);
				sum=sum+i;
			}
		}
		if(sum==n)
			return true;
		return false;
	}
}
			