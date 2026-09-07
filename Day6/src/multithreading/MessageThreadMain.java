package multithreading;

public class MessageThreadMain {
	public static void main(String[] args) {
		Thread t1 = new MessageThread("Hello", 2000);
		Thread t2 = new MessageThread("Welcome", 500);
		
		t1.start();
		t2.start();
		
		//t1.run();
		//if run the run method directly it work like normally first run hello 10 times then welcome
		//Its not work like multi-threading
	}

}

/*
Sleeping = Taking a timed break	= sleep(5)
Suspended = Execution deliberately paused =	User pauses a process
Blocked I/O = Waiting for I/O to finish = Waiting for file read
Waiting = Waiting for an event/process/resource = Waiting for another process
 */