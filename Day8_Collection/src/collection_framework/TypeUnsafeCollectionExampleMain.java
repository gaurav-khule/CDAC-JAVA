package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class TypeUnsafeCollectionExampleMain {
	public static void main(String[] args) {
		//List is interface and ArayList is class
		List cities = new ArrayList();
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Nashik");
		cities.add("Kolhapur");
		cities.add("Solapur");
		cities.add(11); // this not get error cause it is type-unsafe
		
		for(Object obj : cities) {
			String city = (String)obj;
			System.out.println(city.toUpperCase());
		}
	}
}
