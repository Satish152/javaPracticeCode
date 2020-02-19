package javasampleprograms;

public class PrintOnlyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           printOnlyNum2();
	}

	public static void printOnlyNum(){
		String test="adfds45335dsdsf";
		test=test.replaceAll("[a-zA-z]", "");
		System.out.println(test);
	}
	
	public static void printOnlyNum2(){
		String test="adfds45335dsdsf";
	    char[] arr=test.toCharArray();
	    for(int i=0;i<arr.length;i++){
	    	try{
	        int val=Integer.parseInt(Character.toString(arr[i]));
	        	System.out.print(val);
	        }catch(Exception e){
	        	
	        }
	    }
	}
}
