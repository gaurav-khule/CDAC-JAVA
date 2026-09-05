package exception_handling;
//A program to accept 2 numbers as Command Line Arguments and print their addition
public class WithExceptionHandlerMain {
	public static void main(String[] args) {
	
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int result = n1 + n2;
			System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Enter atleast 2 numbers..");
		}
	}
}
