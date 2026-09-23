package digitextraction;

import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num: ");
		int num = sc.nextInt();
		int temp = num;
		int sum=0;
		while(num>0) {
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
//			sum = sum + (int) Math.pow(digit, 3);
			num = num/10;
		}
		
		System.out.println(temp + " Is Armstrong: " + (temp==sum));
		
//		if(temp == sum) {
//			System.out.println("Armstrong");
//		}else {
//			System.out.println("Not Armstrong");
//		}
	}
}
