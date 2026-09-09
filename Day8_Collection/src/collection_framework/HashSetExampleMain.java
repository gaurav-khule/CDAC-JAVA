package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExampleMain {
	public static void main(String[] args) {
		Set<String> countries = new HashSet<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Japan");
		countries.add("Germany");
		countries.add("France");
		countries.add("India");
		countries.add("India");
		countries.add("India");
		countries.add("India");
		System.out.println("Size: " + countries.size());
		
		for(String country : countries)
			System.out.println(country);
	}
}
