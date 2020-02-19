package javasampleprograms;

public class ThirdLargestInArray {

	public static void main(String[] args) {
             int[] students={12,56,89,4,25,67};
             System.out.println(students.length);
             System.out.println("before");
             for(int i=0;i<students.length;i++){
            	 System.out.print(students[i]+" ");
             }
             System.out.println();
             int third=ThirdLargest(students);
             System.out.println("After");
             for(int i=0;i<students.length;i++){
            	 System.out.print(students[i]+" ");
             }
             System.out.println();
             System.out.println(third);
	}

	public static int ThirdLargest(int arr[]){
	     int len=arr.length;
	     
	     int temp;
	      for(int i=0;i<len;i++){
	    	  for(int j=1;j<len-i;j++){
	    		  if(arr[i]>arr[j]){
	    			 temp=arr[j];
	    			arr[j]=arr[i];
	    			arr[i]=temp; 			
	    		  }
	    	  }
	      }
	      return arr[len-3];
	}
}
