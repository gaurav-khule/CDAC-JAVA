package exception_handling;

public class ThrowsMain {
	private static void doTest() throws Exception {  
		
	}
	private static void performTest() throws Exception{
		
	}
	// Here i can use throws Exception or Throwable but can't use base classes of exception 
	private static void callPerformTest() throws Exception {
		performTest();
	}
	private static void callDoTest() {
		try {
			doTest();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	private static void invokeDoTest() throws Exception{
		doTest();
	}
	public static void main(String[] args) {
		callDoTest();
		
		try {
			invokeDoTest();
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}
	}
}
