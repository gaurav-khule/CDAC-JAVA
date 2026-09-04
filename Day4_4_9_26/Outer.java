package Day4_4_9_26;

public class Outer {
	
	private int x=10;
	private static int y=20;
	
	//INNER Class
	public static class StaticInner {
		public void print() {
//			System.out.println(x); // Error because 'x' is non-static
			System.out.println("Y = "+y);
		}
	}
	
	//Nested Class
	public class Nested {
		public void display() {
			System.out.println("X from nested = " + x);
			System.out.println("Y from nested = " + y);
		}
	}
	
	//LOCAL class
	public void showMesage() {
		class Message{        //A class is created in method is know as local class
			String getMessage(String name, String message) {
				return message + " " + name;
			}
		}
		Message msgObj = new Message();
		String greeting = msgObj.getMessage("Jack", "Hi, Buddy!!");
		System.out.println(greeting);
	}
	
	
	//ANONYMOUS class
	//Specially used with abstract classes or interface
	//When the requirement of any class is rare at that time we create Anonymous class 
	
}
