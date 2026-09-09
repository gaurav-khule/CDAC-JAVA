package collection_framework;

import java.util.Stack;

public class StackExampleMain {

	public static void main(String[] args) {
		Stack dataValues = new Stack();
		dataValues.add("Welcome to collections");
		dataValues.add("AI is booming");
		dataValues.add(new Person("Amithabh", "Bachchan", 85));  // accepts this also
		
		int myMarks = 345; // in collection it only accepts non-primitive
		dataValues.add(myMarks);  //it convert into Auto-Boxing add(new Integer(myMarks))
		
		float myPercentage = 86.23f;
		dataValues.add(myPercentage);
		
		boolean pass = true;
		dataValues.add(pass);
		
		dataValues.add("Welcome to collections");
		dataValues.add(myMarks);
		
		int size = dataValues.size();   // Return size of stack
		
		for(int index=0; index<size; index++) {
			Object val = dataValues.get(index);
			System.out.println(val);
		}
		
		//using for each
		System.out.println("-----------------");
		for(Object val2 : dataValues) {
			System.out.println(val2);
		}
	}
}
