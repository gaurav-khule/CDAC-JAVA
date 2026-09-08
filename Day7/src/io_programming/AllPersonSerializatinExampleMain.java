package io_programming;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AllPersonSerializatinExampleMain {

	public static void main(String[] args) {
		String filePath = "./src/resources/all_persons.txt";
		
		try(FileOutputStream fout = new FileOutputStream(filePath);
			ObjectOutputStream out = new ObjectOutputStream(fout))
		{
			Person p1 = new Person("Smriti", "Mandana", 30);
			Person p2 = new Person("Harmanpreet", "Kaur", 35);
			Person p3 = new Person("Sania", "Nehwal", 40);
			Person p4 = new Person("Mithali", "Raj", 45);
			Person p5 = new Person("P.V.", "Sindhu", 38);
			
			Person[] allPersons = {p1,p2,p3,p4,p5};
			out.writeObject(allPersons);
			
			System.out.println("All Persons Serialized");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
