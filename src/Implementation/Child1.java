package Implementation;

public class Child1 extends Thread{
	public void run() {
		Child1 ob = new Child1();
		ob.start();
		
		for(int x=0; x < 5; x++) {
			System.out.println(Thread.currentThread().getName() + " " + x);
		}
	}
}
