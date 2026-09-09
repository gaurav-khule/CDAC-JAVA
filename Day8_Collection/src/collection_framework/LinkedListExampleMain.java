package collection_framework;

import java.util.LinkedList;

public class LinkedListExampleMain {
	public static void main(String[] args) {
		LinkedList appliances = new LinkedList();
		appliances.add("Fan");
		appliances.add("Mizer");
		appliances.add("Tubelight");
		appliances.add("Washing Machine");
		
		appliances.addFirst("Microwave");   // add on first position of list
		
		 
		
		for(Object obj : appliances) 
			System.out.println(obj);
		System.out.println("----------------------------");	
		appliances.removeFirst();
		appliances.removeLast();
		for(Object obj : appliances) 
			System.out.println(obj);	
		System.out.println("First Element: " + appliances.getFirst());
		System.out.println("Last Element: " + appliances.getLast());
	}
}
