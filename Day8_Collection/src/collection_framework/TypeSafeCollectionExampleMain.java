package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class TypeSafeCollectionExampleMain {
	public static void main(String[] args) {
		// This list only accept string objects
		List<String> cities = new ArrayList<>();     //type-safe collection
		cities.add("New Delhi");
		cities.add("Mumbai");
		cities.add("Bangelor");
		cities.add("Chennai");
//		cities.add(100); 
		
		for(String city : cities)
			System.out.println(city.toUpperCase());
		
	}
}
