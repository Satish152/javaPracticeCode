package javasampleprograms;

//cubing of number by isolating it in to parts and adding of those cubes it gives same number
//eg: 153 = 1*1*1 + 5*5*5+ 3*3*3' = 153
public class ArmStrongNumber {
 
	public static void main(String[] args) {
		int num=321;
		int rem=0;
		int sum=0;
		int temp=num;
		while(num>0){
			rem=num%10;
			num=num/10;
			sum=sum+rem*rem*rem;
		}
		if(sum==temp){
			System.out.println("number is a Armstrong Number");
		}
			else{
				System.out.println("Number is not a armstrong");
		}

	}

}
