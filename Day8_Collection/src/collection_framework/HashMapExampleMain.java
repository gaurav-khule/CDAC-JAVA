package collection_framework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExampleMain {
	public static void main(String[] args) {
		Map<String, Country> countryMap = new HashMap<>();
		
		Country ind = new Country();
		Country usa = new Country("USA", "Washington");
		Country jpn = new Country("Japan", "Tokyo");
		Country ger = new Country("Germany", "Berlin");
		Country fra = new Country("France", "Paris");
		
		countryMap.put("IND", ind);
		countryMap.put("US", usa);
		countryMap.put("JPN", jpn);
		countryMap.put("GER", ger);
		countryMap.put("FRA", fra);
		
		//Fetching set of keys from Map
		Set<String> allKeys = countryMap.keySet();
		for(String currentKey : allKeys) {
			Country currentVlaue = countryMap.get(currentKey);
			System.out.println("Key: " + currentKey);
			System.out.println("Value: " + currentVlaue);
			System.out.println("-------------------------------------------------");
		}
		
		System.out.println("###########################################################");
		//Fetching set entries from Map
		// entrySet() returns its entire key value 
		Set<Map.Entry<String, Country>> setofEntries = countryMap.entrySet();
		for(Map.Entry<String, Country> currentEntry : setofEntries) {
			String key = currentEntry.getKey();
			Country value = currentEntry.getValue();
			System.out.println("Key: " + key);
			System.out.println("Value: " + value);
			System.out.println("------------------------------");
		}
		
		System.out.println("----------+--------+---------+------------+------------+----------");
		//Fetching values directly
		Collection<Country> allcountries = countryMap.values();
		for(Country currentCountry : allcountries)
			System.out.println(currentCountry);
	}
}
