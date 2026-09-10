package java_8_features;

public class InterfaceEnhancementExample {
	public static void main(String[] args) {
		Printable.info();
		Printable pr = new PrintableImpl();
		pr.print();
	}
}

interface Printable{
	void print();
	// here default means default implementation
	default void setUp() {
		System.out.println("Setting up the printer, paper etc.");
	}
	static void info() {
		System.out.println("This functionality is use to perform printing");
	}
}

class PrintableImpl implements Printable{
	@Override
	public void print() {
		setUp();
		System.out.println("Printing the Doc...");
	}
}