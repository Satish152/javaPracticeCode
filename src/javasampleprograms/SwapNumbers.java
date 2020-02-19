package javasampleprograms;

public class SwapNumbers {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		int temp;
		/*temp=a;
		a=b;
		b=temp;
		System.out.println(a +" "+b); */
		
		a=a+b;  //a=11
		b=a-b;   //b= 11-6 = 5;
		a=a-b;  //a=11-5=6
		
		System.out.println(a +" "+b);
		
		String name="AllLinks(92)";
		for(int i=0;i<name.length();i++){
			System.out.println("char at "+i+ " "+name.charAt(i));
		}
		System.out.println(name.substring(9,11));
	}

}
