package patterns;

import java.util.Scanner;

public class MenuDriven_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		String name="";
		System.out.print("Enter your beautiful name: ");
		name = sc.nextLine();
		do {
			System.out.println("----Cafe Vasa-----");
			System.out.println("1.Tea");
			System.out.println("2.Coffe");
			System.out.println("3.Water");
			System.out.println("4.Maggie");
			System.out.println("0.Exit");
			
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Tea for "+ name + " Ready...");
				break;
			case 2:
				System.out.println("Just Coffee for "+ name + " Ready...");
				break;
			case 3:
				System.out.println(name+" Your water bottle..");
				break;
			case 4:
				System.out.println("Maggie for "+ name + " Ready...");
				break;
			case 0:
				System.out.println("Visit Again!!");
				break;
			default:
				System.out.println("INVALID CHOICE!!");
			}
		}while(choice != 0);
	}
}
