package Day2_2_9_26;

public class ParameterPassingMain {

	private static void changeAge(int ageCopy) {
		ageCopy = 35;
	}
	
	private static void changeBook(Book myBookCopy) {
		myBookCopy.setTitle("Black Water");
		myBookCopy.setPrice(985);
	}
	
	public static void main(String[] args) {
		int age = 25;
		System.out.println("Before change: "+age);
        changeAge(age);
        System.out.println("After change: "+age);
        
        System.out.println("====================");
        
        Book myBook = new Book("Harry potter", 1025);
        System.out.println("Book BEFORE change: " );
        System.out.println( myBook.getTitle());
        System.out.println(myBook.getPrice());
        changeBook(myBook);
        System.out.println("Book AFTER change: " );
        System.out.println( myBook.getTitle());
        System.out.println(myBook.getPrice());
	}
}
