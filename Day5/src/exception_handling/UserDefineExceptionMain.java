package exception_handling;

public class UserDefineExceptionMain {

	public static void main(String[] args) {
		try {
			int position = NameCatelog.getPosition("Alia");
			System.out.println("Position: " + position);
		} catch (NameNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
