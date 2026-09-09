package collection_framework;

import java.util.Stack;

public class StackOperationExampleMain {

	public static void main(String[] args) {
		Stack stItems = new Stack();
		
		// .push() =  adds an element to the top
		stItems.push("Pen");
		stItems.push("Pencile");
		stItems.push("Eraser");
		stItems.push("Ruler");
		stItems.push("Drafter");
		
		for(Object obj : stItems) {
			System.out.println(obj);
		}
		System.out.println("Current Size: " + stItems.size());
		
		System.out.println("----------------------");
		Object popperdObject = stItems.pop();
		System.out.println("Popped Object: " + popperdObject);
		System.out.println("Current Size: " + stItems.size());
		
		System.out.println("------------------------------");
		Object peekObject = stItems.peek();
		System.out.println("Peeked Object: " + peekObject);
		System.out.println("Current Size: " + stItems.size());
	}
}
