package exception_handling;
//A program to accept 2 numbers as Command Line Arguments and print their division
public class CombinedExceptionHandlerMain {
	public static void main(String[] args) {
	
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int result = n1 / n2;
			System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
			if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Enter atleast 2 numbers..");
			}
			else {
				System.out.println("Enter 2nd value as non zero");
			}
			
		}
			
	}
}

