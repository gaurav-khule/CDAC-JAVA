package io_programming;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderForObjectCreationExampleMain {

	public static void main(String[] args) {
		String filePath = "./src/resources/mobile_numbers.txt";
		try(FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr))
			{
				while(true) {
				String line = br.readLine();
				if(line == null)
					break;
				// - is delimiter
				String[] tokens = line.split("-");
				String country_code = tokens[0];
				String mobile_no = tokens[1];
				MobileNumber mobNum = new MobileNumber(country_code, mobile_no);
				System.out.println(mobNum);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
}
