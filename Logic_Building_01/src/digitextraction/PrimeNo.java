package digitextraction;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num: ");
		int num = sc.nextInt();
		boolean flag = false;
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
//		System.out.println(num+" Prime no: " + (flag==false));
		
		if(flag == false) {
			System.out.println(num+": Given num is prime");
		}else {
			System.out.println(num+": Not a prime number");
		}
	}
}
