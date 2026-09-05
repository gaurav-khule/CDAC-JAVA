package exception_handling;
//A program to accept 2 numbers as Command Line Arguments and print their division
public class FinallyMain {
	public static void main(String[] args) {
	
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int result = n1 / n2;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Enter 2nd value as non zero");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Enter atleast 2 numbers..");
		}
		//This is generic way to handle exception
		catch(Exception e) {
			System.out.println("Unable to proceed due to some Error");
		}
		//It execute every time if the exception is raised or not
		finally {
			System.out.println("Thank You!!!!");
		}
	}
}
