package multithreading;

public class MsgThreadimpl extends Thread{
	private Msg messageObject;
	private String pattern;
	
	
	public MsgThreadimpl(Msg messageObject, String pattern) {
		super();
		this.messageObject = messageObject;
		this.pattern = pattern;
	}

	public void run() {
		synchronized (messageObject) {
			try {
				messageObject.printMsg(pattern);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}	 
	}
}
