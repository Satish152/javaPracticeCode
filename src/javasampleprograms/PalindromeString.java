package javasampleprograms;

public class PalindromeString {

	public static void main(String[] args) {
		String name="Nadam";
		String rev=" ";
		int nameLength=name.length();
		for(int i=nameLength-1;i>=0;i--){
		rev=rev+name.charAt(i);
		}
      System.out.println(rev);
     
	}
}
