package io_programming;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersonSerializatinExampleMain {

	public static void main(String[] args) {
		String filePath = "./src/resources/person.txt";
		
		try(FileOutputStream fout = new FileOutputStream(filePath);
			ObjectOutputStream out = new ObjectOutputStream(fout))
		{
			Person personObject = new Person("Smriti", "Mandana", 30);
			out.writeObject(personObject);
			System.out.println("Person Object Serialized");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
