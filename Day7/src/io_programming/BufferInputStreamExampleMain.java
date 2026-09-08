package io_programming;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInputStreamExampleMain {

	public static void main(String[] args) {
		String filePath = "./src/resources/cartoon.txt";
		//FileInputStream implements Closable, and Closable extends AutoCloseable:
		try(
			FileInputStream fin = new FileInputStream(filePath); 
			BufferedInputStream bin = new BufferedInputStream(fin))
		{
			while(true) {
				//bin.read() = it will the buffer  
				int charValue = bin.read();
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


