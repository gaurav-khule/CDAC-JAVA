package multithreading;

public class MessageRunnable implements Runnable {

	private String message;
	private int timeGap;
	
	public MessageRunnable(String message, int timeGap) {
		super();
		this.message = message;
		this.timeGap = timeGap;
	}

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(message+" : " + i);
			try {
				Thread.sleep(timeGap);  // It hold for some second to print the output
			} catch (InterruptedException e) {	
				e.printStackTrace();
			}
		}

	}

}

/*Time-slicing scheduling is a technique where the CPU gives each thread a fixed amount of time to execute, then switches to another thread.*/