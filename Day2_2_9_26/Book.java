package Day2_2_9_26;

public class Book {
	private String title;
	private int price;
	static int bookCount;
	
	/*
	 static is used when a member should belong to the class itself or retain its value 
	 instead of creating a separate copy for every object.
	 */
	
	//Creating static block
	static {
		int x=10;
		int y=90;
		int startwith = x+y;
		bookCount = startwith;
	}
	
	private static int totalNumberofBooks;
	//Creating method getTotal Number of books
	public static int getTotalNumberofBooks() {
		return totalNumberofBooks;
	}
	
	
	public Book() {
	title = "Ikigai";
	price = 375;
	bookCount++;
	totalNumberofBooks++;
	}

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
		bookCount++;
		totalNumberofBooks++;
	}
	
	public Book(int price, String title) {
		this.title = title;
		this.price = price;
		bookCount++;
		totalNumberofBooks++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
