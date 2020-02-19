package javasampleprograms;

public class Override1 extends Override{

	public static void main(String[] args) {
		Override1 override=new Override1();
		override.print();
		
		Override obj=new Override();
		obj.print();
		
		Override ride=new Override1();
		ride.print();
		
		
	
	}
	public void print(){
		System.out.println("this is a child class");
	}

}
