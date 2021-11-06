package Implementation;

public class MyMain extends Thread{

	public static void main(String[] args) {
		Child1 thread1  = new Child1();
		thread1.setName("Child Tread 1 : ");
		thread1.start();
		
		Child2 thread2 = new Child2();
		thread2.setName("Child Thread 2 : ");
		thread2.start();
		
		MyMain thread3 = new MyMain();
		thread3.start();
		
		for(int x=0; x < 10; x++) {
			System.out.println("Main thread " + x);
		}
	}
	
	public void run() {
		for(int x=0; x < 10; x++) {
			System.out.println("Child thread 3 : " + x);
		}
	}

}
