package interviewPrep;

public class ArraySort {

	public static void main(String[] args) {
		int[] num={5,578,2425,78,87,15,7,4,6};
        num=arrSort(num);
        for(int i=0;i<num.length;i++){
        	System.out.print(num[i]+" ");
        }
	}

	public static int[] arrSort(int[] arr){
		int temp=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length-i;j++){
				if(arr[j-1]>arr[j]){
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					count=count+1;
				}
			}
			System.out.println("i value "+i);
			for(int k=0;k<arr.length;k++){
				System.out.print(arr[k]+"  ");
			}
			System.out.println();
		}
		System.out.println(count);
		return arr;		
	}
}
