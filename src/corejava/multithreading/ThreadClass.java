package corejava.multithreading;

class Threadext extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) 
			System.out.println("Thread class....!");
	}
}
class Threadimpl implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) 
			System.out.println("Runnable imple....!");
	}
	
}
public class ThreadClass {
	public static void main(String[] args) {
		Threadext ext=new Threadext();
		
		Threadimpl impl = new Threadimpl();
		Thread t1=new Thread(impl);
		Thread t2=new Thread(impl);
		t1.start();
		try {
			Thread.sleep(1000);
			t2.start();
			ext.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
