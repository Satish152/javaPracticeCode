package javasampleprograms;

public class BubbleSort {

public void sort(int[] arr){
	int len=arr.length;
	int temp=0;
   for(int i=0;i<len;i++){
	   for(int j=1;j<len-i;j++){
		   if(arr[j-1]>arr[j]){
			   temp=arr[j-1];
			   arr[j-1]=arr[j];
			   arr[j]=temp;
		   }
	   }
   }
 }

public static void main(String args[]){
	BubbleSort sort=new BubbleSort();
//	int[] num=new int[5];
//	num[0]=15;
//	num[1]=8;
//	num[2]=10;
//	num[3]=1;]
//	num[4]=16;
	
	int[] num={5,578,2425,78,87,15,7,4,6};
	
	System.out.println("Before Sorting");
	for(int i=0;i<num.length;i++){
		System.out.print(num[i]+" ");
	}
	sort.sort(num);
	
	System.out.println("After Sorting");
	for(int i=0;i<num.length;i++){
		System.out.print(num[i]+" ");
	}
}

}
