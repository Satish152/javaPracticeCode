package javasampleprograms;

public class ThreadWithRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Thread t=new Thread(()->{
	for(int i=0;i<4;i++){
		System.out.println("this is a 1st class");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
});
Thread t1=new Thread(()->{
	for(int i=0;i<4;i++){
		System.out.println("this is a 2nd class");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		
});

t.start();
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
t1.start();

try {
	t.join();
	t1.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println(t.isAlive());
System.out.println("End");
}
}
