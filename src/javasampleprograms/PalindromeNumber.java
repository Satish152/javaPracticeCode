package javasampleprograms;

public class PalindromeNumber {
 
	//reversing of number gives same number that entered
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=1000;
       int rem=0;
       int src=0;
       int temp=num;
     while(num>0){
       rem=num%10;
       num=num/10;
       src=src*10+rem;
	}
       	if(src==temp){
		System.out.println("Number is a palindrome");
	}
	else
	{
		System.out.println("Number is not a palindrome");
	}
	}
}
