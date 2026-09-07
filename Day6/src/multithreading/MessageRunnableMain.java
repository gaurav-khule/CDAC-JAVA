package multithreading;

public class MessageRunnableMain {

	public static void main(String[] args) {
		Runnable r1 = new MessageRunnable("Hi!!", 2000);
		Runnable r2 = new MessageRunnable("Bye!!!", 500);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
