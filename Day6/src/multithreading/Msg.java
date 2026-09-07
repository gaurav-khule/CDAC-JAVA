package multithreading;

public class Msg {
	
	private String content;

	public Msg(String content) {
		super();
		this.content = content;
	}
	
	public void printMsg(String decoration) throws InterruptedException {
		System.out.println(decoration);
		Thread.sleep(2000);
		System.out.println(content);
		Thread.sleep(2000);
		System.out.println(decoration);
		Thread.sleep(2000);
	}
}
