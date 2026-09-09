package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class HashSetWithCountryExampleMain {
	public static void main(String[] args) {
		Set<Country> countries = new HashSet<>(); 
		
		Country ind = new Country();
		Country usa = new Country("USA", "Washington");
		Country jpn = new Country("Japan", "Tokyo");
		Country ger = new Country("Germany", "Berlin");
		Country fra = new Country("France", "Paris");
		
		countries.add(ind);
		countries.add(usa);
		countries.add(jpn);
		countries.add(ger);
		countries.add(fra);
		// if we don't override equals() it will compare memory and it added to the set to and it is not allowed duplicate value in set 
		// so we have to override equals() method 
		countries.add(new Country("Japan", "Tokyo"));
		
		for(Country ctr : countries)
			System.out.println(ctr);
	}
}
