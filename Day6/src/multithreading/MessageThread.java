package multithreading;

public class MessageThread extends Thread {
	//Print the message 10 times with a time gap between 2 messages
	
	private String message;
	private int timeGap;
	
	
	public MessageThread(String message, int timeGap) {
		super();
		this.message = message;
		this.timeGap = timeGap;
	}
	
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
