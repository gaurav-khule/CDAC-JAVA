package io_programming;

import java.io.FileInputStream;

public class FileReadingUsingTryWithResourcesExampleMain {

	public static void main(String[] args) {
		String filePath = "./src/resources/cartoon.txt";
		//FileInputStream implements Closable, and Closable extends AutoCloseable:
		//try-with-resources
		try(FileInputStream fin = new FileInputStream(filePath))
		{
			while(true) {
				// .read() here we didn't take any parameter thats why it read single char
				int charValue = fin.read();
				if(charValue == -1) // Check for EOF
				break;
				char ch = (char)charValue; 
				System.out.print(ch);
			}
		}
			catch(Exception ex) {
				ex.printStackTrace();
		}
	}
}


