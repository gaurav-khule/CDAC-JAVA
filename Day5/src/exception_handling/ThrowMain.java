package exception_handling;

public class ThrowMain {
	private static int doDivide(int x, int y) {
		if(y == 0) {
			RuntimeException rx = new RuntimeException("Unable to perform division");
			throw rx;    // using throw 
		}
			return x/y;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(doDivide(400, 80));
			System.out.println(doDivide(49, 0));
			System.out.println(doDivide(70, 14));
		}catch(RuntimeException rxRef){
			String errorMesage = rxRef.getMessage();  // getMessage() : Prints the description of the exception
			System.out.println(errorMesage);
		}
		
		/*
		 	printStackTrace(): Prints the full stack trace of the exception, 
		 					   including the name, message and location of the error.
			       toString(): Prints exception information in the format of the Name of the exception.
		 */
	}
}
