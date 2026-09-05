package multithreading;

public class GreetingThreadMain {
	public static void main(String[] args) {
		Thread th = new GreetingThread();
		th.start();
	}

}
