package io_programming;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class AllPersonDeserializatinExampleMain {

	public static void main(String[] args) {
		String filePath = "./src/resources/all_persons.txt";
		
		try(FileInputStream fout = new FileInputStream(filePath);
			ObjectInputStream in = new ObjectInputStream(fout))
		{	
			Object obj = in.readObject();
			Person[] allAvailablePerson = (Person[])obj;
			
			for(Person currentPerson : allAvailablePerson)
				System.out.println(currentPerson);	
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
