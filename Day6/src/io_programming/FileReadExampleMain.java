package io_programming;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExampleMain {

	public static void main(String[] args) {
		// . = current project
		String filepath = "./src/resources/cartoon.txt";
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(filepath);
			while(true) {
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
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
