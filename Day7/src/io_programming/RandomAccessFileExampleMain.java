package io_programming;

import java.io.RandomAccessFile;

public class RandomAccessFileExampleMain {

	public static void main(String[] args) {
		String filePath = "./src/resources/mobile_numbers.txt";
		try(RandomAccessFile rf = new RandomAccessFile(filePath, "r")) 
		{
			long fileSize = rf.length();
			long midPosition = fileSize / 2;
			rf.seek(midPosition);
			while(true) {
				int charValue = rf.read();
				if(charValue == -1) // Check for EOF
				break;
				char ch = (char)charValue;
				System.out.print(ch);
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
