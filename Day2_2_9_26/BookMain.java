package Day2_2_9_26;

public class BookMain {
	static {
		System.out.println("Book in main class");
	}

	public static void main(String[] args) {
		System.out.println("This msg in main method");
		Book b1 = new Book();
		Book b2 = new Book("Magic of Thinking Big", 600);
		Book b3 = new Book("Final Destination", 480);
		System.out.println("Current No of books: "+Book.getTotalNumberofBooks());
		Book b4 = new Book();
		Book b5 = new Book();
		System.out.println("Current No of books: "+Book.bookCount);
		
		for(int i=1; i<=10; i++) {
			new Book();
		}
		System.out.println("Current No of books: "+Book.bookCount);
	}
}
