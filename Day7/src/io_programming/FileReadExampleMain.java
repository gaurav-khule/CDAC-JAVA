package io_programming;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExampleMain {

	public static void main(String[] args) {
		// (.) represent is current project
		String filepath = "./src/resources/cartoon.txt";
		FileInputStream fin = null; 
		
		try {
			fin = new FileInputStream(filepath); // Stream is opened for reading
			while(true) {
				// read is use to ready file step by step
				int charValue = fin.read();
				if(charValue == -1) // Check for EOF
				break;
				char ch = (char)charValue;
				System.out.print(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				// Stream is to disconnected with the hard disk where the files are present
				fin.close(); // Stream is closed
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
