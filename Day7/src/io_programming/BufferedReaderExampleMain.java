package io_programming;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderExampleMain {

	public static void main(String[] args) {
	String filePath = "./src/resources/cartoon.txt";
	try(FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr))
	{
		while(true) {
		String line = br.readLine();
		if(line == null)
			break;
		System.out.println(line);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
		}
	}
}
