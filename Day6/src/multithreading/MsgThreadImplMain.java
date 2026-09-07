package multithreading;

public class MsgThreadImplMain {

	public static void main(String[] args) {
		Msg ms = new Msg("Welcome to Synchronization");
		Thread t1 = new MsgThreadimpl(ms, "**********");
		Thread t2 = new MsgThreadimpl(ms, "##########");
		t1.start();
		t2.start();
		
		
	}
}
