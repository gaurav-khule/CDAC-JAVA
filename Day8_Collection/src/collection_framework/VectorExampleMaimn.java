package collection_framework;

import java.util.Vector;

public class VectorExampleMaimn {

	public static void main(String[] args) {
		Vector myVector = new Vector();
		int size = myVector.size();
		System.out.println("Size: " + size);
		// no of element vector can hold for now it hold 10
		int capacity = myVector.capacity();
		System.out.println("Capacity :" + capacity);
		System.out.println("-----------------------------");
		for(int i=1; i<= 10; i++) {
			myVector.add(i);}
		System.out.println("Size: " + myVector.size());
		System.out.println("Capacity :" + myVector.capacity());
		System.out.println("----------------------------");
		
		myVector.add(11);
		System.out.println("Size: " + myVector.size());
		System.out.println("Capacity :" + myVector.capacity());
	}
}
