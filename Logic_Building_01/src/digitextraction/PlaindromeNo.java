package digitextraction;

import java.util.Scanner;

public class PlaindromeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num: ");
		int num = sc.nextInt();
		int FinalNum= num;
		int rev=0;
		while(num>0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num/10;			
		}
		
		
		
		if(FinalNum == rev) {
			System.out.println("No is Palindrome");
		}else {
			System.out.println("No is not Palindrome");
		}
	}
}
