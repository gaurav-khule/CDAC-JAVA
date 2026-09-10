package programming_essentials;

import java.util.List;

public class EnumExampleMain {
	
	
	private static void printIndianCitizenNames(List<Person> allCitizens) {
		for(Person currentPerson : allCitizens) {
			Nationality curreNationality = currentPerson.getNationality();
			if(curreNationality.equals(Nationality.INDIAN)) {
				System.out.println(currentPerson.getName());
			}
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Virat", Nationality.INDIAN);
		Person p2 = new Person("Smith", Nationality.US);
		Person p3 = new Person("Miharu", Nationality.JAPANESE);
		Person p4 = new Person("Rohit", Nationality.INDIAN);
		Person p5 = new Person("Leon", Nationality.GERMAN);
		
		List<Person> allPersons = List.of(p1,p2,p3,p4,p5);
		printIndianCitizenNames(allPersons);
	}
}
