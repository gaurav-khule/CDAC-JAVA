package io_programming;

import java.io.InputStream;
import java.util.*;

public class AcceptUserInputExampleMain {
	public static void main(String[] args) {
		InputStream keyBoard = System.in;
		try
		(Scanner sc = new Scanner(keyBoard))
		{
			System.out.print("Enter your name: ");
			String fullName = sc.nextLine();
			System.out.print("Enter age: ");
			int age = sc.nextInt();
			System.out.print("Enter weight(kg): ");
			float wgt = sc.nextFloat();
			
			System.out.println("---Here are the details---");
			System.out.println("Full Name: " + fullName);
			System.out.println("Age: " + age + " years");
			System.out.println("Weight: " + wgt + " kg");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
