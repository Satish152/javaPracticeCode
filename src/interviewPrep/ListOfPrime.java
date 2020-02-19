package interviewPrep;

public class ListOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            prime(200);
	}

	public static void prime(int num){
		boolean status=true;
		for(int i=100;i<num;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					status=false;
					break;
				}else{
					status=true;
				}
			}
			if(status){
				System.out.print(i+" ");
			}
		}
	}
}
