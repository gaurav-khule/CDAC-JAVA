package io_programming;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class FileReadUsingFileExampleMain {

	public static void main(String[] args) {
		String filePath = "./src/resources/cartoon.txt";
		File file = new File(filePath);
		
		if(file.isFile() && file.exists()) {
			long fileSize = file.length();
			
			//here it creating byte size array respected to file size
			byte[] data = new byte[(int)fileSize];
			try(FileInputStream fin = new FileInputStream(file);
				BufferedInputStream bin = new BufferedInputStream(fin))
			{
				// here we passing parameter in read(data) thats why we don't use -1 or like first example
				bin.read(data);
				String fileData = new String(data);
				System.out.println(fileData);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}else
		System.out.println("Unable to proceed because the given path is invalid");
	}
}
