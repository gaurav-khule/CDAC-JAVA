package multithreading;

public class CountDownMain {
	public static void main(String[] args) {
		Thread countDown = new CountDownThread();
		System.out.println("Countdown Begins....");
		countDown.start();
		try {
			countDown.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Countdown ends....");
	}
}
