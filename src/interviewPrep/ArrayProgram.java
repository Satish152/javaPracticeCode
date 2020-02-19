package interviewPrep;

public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[][] arr={{0,1},{1,2},{2,3}};
      for(int i=0;i<arr.length;i++){
    	  for(int j=0;j<arr.length-1;j++){
    		  System.out.print(arr[i][j]+2+" ");
    	  }
    	  System.out.println();
      }
	}

}
