package io_programming;

import java.io.FileOutputStream;

public class FileWriteExmapleMain {       

	public static void main(String[] args) {
		String filePath = "./src/resources/games.txt";
		try(FileOutputStream fout = new FileOutputStream(filePath, true)){
			
			//value true is indicates to file to append data in existing file without disturbing old data
			//Append mode = use to append data without overwrite to old data 
			
			String gamesData = "\n6. Table tennis\n7. Baseball";
			
			//None of take string data here for that we use byte[] 
			
			byte[] data = gamesData.getBytes();
			fout.write(data);
			System.out.println("Data is written to file successfully..");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
