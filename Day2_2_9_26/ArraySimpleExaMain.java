package Day2_2_9_26;

public class ArraySimpleExaMain {

	public static void main(String[] args) {
		//Declaring array of 5 integer called as numbers
		int[] numbers = new int[5];
		numbers[0] = 11;
		numbers[1] = 36;
		numbers[2] = 95;
		numbers[3] = 14;
		numbers[4] = 27;
		
		int arrSize = numbers.length;
		for(int index=0; index<arrSize; index++) {
			int num = numbers[index];
			System.out.print(num+" ");
		}
		
		System.out.println("\n======================");
		//for each   mostly use in array and collections
		for(int n : numbers) {
			System.out.print(n+" ");
		}
	}
}
