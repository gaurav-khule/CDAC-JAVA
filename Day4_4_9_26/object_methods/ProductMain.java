package object_methods;

public class ProductMain {
	public static void main(String[] args) {
		int val=100;
		System.out.println(val);
		System.out.println("=================================");
		Product p1 = new Product("P101", "2TB USB HDD", 15500);
		System.out.println(p1.getProductId());
		System.out.println(p1.getDescription());
		System.out.println(p1.getPrice());
		System.out.println("-----------------------------------");
		System.out.println(p1);//Implicit Call
		System.out.println(p1.toString()); // Explicit Call
		System.out.println("--------------------------------------------");
		int val2 = 100;
		System.out.println(val == val2);
		System.out.println("--------------------------------------------");
		Product p2 = new Product("P101", "2TB USB HDD", 15500);
		System.out.println(p1 == p2);
		System.out.println("------------------------------------------");
		System.out.println(p1.equals(p2));
		System.out.println("---------------------");
	}
}
