package io_programming;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PersonDeserializationExampleMain {

	public static void main(String[] args) {
		String filePath = "./src/resources/person.txt";
		try(FileInputStream fin = new FileInputStream(filePath);
			ObjectInputStream in = new ObjectInputStream(fin)) 
		{
		Object obj = in.readObject();
		
		// if we use to get obj.getFirstName it show error bcoz obj will search it in Object 
		// to find it in person class we need to Down-Casting 
		System.out.println(obj);
		Person ps = (Person)obj; // Down-Casting
		System.out.println(ps.getFirstName());
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
