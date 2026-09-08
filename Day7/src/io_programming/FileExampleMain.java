package io_programming;

import java.io.File;
import java.io.IOException;

public class FileExampleMain {

	public static void main(String[] args) {
		String path1 = "./src/resources/games.txt";
		String path2 = "./src/resources";
		String path3 = "./src/resources/indoor_games.txt";
		String path4 = "./src/resources/images";
		
		File f1 = new File(path1);
		File f2 = new File(path2);
		File f3 = new File(path3);
		File f4 = new File(path4);
		
		// is exist()
		System.out.println(path1 + " is available: " + f1.exists());
		System.out.println(path2 + " is available: " + f2.exists());
		System.out.println(path3 + " is available: " + f3.exists());
		System.out.println(path4 + " is available: " + f4.exists());
		System.out.println("---------------------------------------");
		
		// isFile()
		System.out.println(path1 + " file: " + f1.isFile());  // true
		// isDirectory()
		System.out.println(path1 + " directory: " + f1.isDirectory()); // false
		
		System.out.println(path2 + " file: " + f2.isFile());  // false
		System.out.println(path2 + " directory: " + f2.isDirectory()); //true bcoz its a folder
		System.out.println("-------------------------------------------");
		
		// .createNewFile() is use to create new file
		try {
			f3.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// .mkdir() is use to create directory
		f4.mkdir();
	}
}
