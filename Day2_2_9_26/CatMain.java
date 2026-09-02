package Day2_2_9_26;

import java.util.*;

public class CatMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cat mycat = new Cat();
		
		Cat yourCat = new Cat(2,"Shadow","Husky","Brown",1.3f);
		
		Cat ourCat = new Cat("Alex","pitBull","off-white",3,2.2f);
		
//		System.out.print("Enter name of your Dog: ");
//		String nam = sc.next();
//		mycat.setName(nam);
//		mycat.setCatID(1);
//		mycat.setBreed("Persian");
//		mycat.setColor("White");
//		mycat.setAge(4.3f);
		
		mycat.walk();
		System.out.println("==============");
		
		yourCat.walk();
		System.out.println("==============");
		ourCat.walk();
	}
}
