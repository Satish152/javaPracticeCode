package javasampleprograms;

public class LinearSearch {

	public int search(int[] arr,int key){
		int len=arr.length;
		for(int i=0;i<len;i++){
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String args[]){
		LinearSearch search=new LinearSearch();
		int arr[]={25,6,7,49,58};
		
		int key=7;
		System.out.println(key+" is at the index of "+search.search(arr,key));
	}
}
