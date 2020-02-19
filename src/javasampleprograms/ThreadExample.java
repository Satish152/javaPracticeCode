package javasampleprograms;

class Test extends Thread{
	public void run(){
		for(int i=0;i<2;i++){
			System.out.println("this is a 1st class");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Test2 extends Thread{
	public void run(){
		for(int i=0;i<2;i++){
			System.out.println("this is a 2nd class");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
}
public class ThreadExample{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        Test t=new Test();
        Test2 t1=new Test2();
        
        t.start();
        Thread.sleep(500);
        t1.start();
	}

}

