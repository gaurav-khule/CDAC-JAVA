package Day2_2_9_26;

public class ArrayOperationsMain {
	
	private static int[] getNameLength(String[] namesCopy) {
		int size = namesCopy.length;
		int[] nameLengths = new int[size];
		int index = 0;
		for(String name : namesCopy) {
			int currentLenght = name.length();
			nameLengths[index] = currentLenght;
			index++;
		}
		return nameLengths;
	}
	
	public static void main(String[] args) {
		//Array declare and initialize 
		String[] names = {"Rajeev", "Aparna", "Vivek","Amruta","Dinesh","Rajkiran","RajKamal"};
		int[] allLengths = getNameLength(names);
		for(int len : allLengths) {
			System.out.print(len+" ");	
		}
		
	//
	}
}
