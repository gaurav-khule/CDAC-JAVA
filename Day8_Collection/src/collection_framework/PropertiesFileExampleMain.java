package collection_framework;

import java.awt.Window;
import java.io.FileInputStream;
import java.util.Properties;

import javax.swing.JFrame;

public class PropertiesFileExampleMain {
	public static void main(String[] args) {
		Properties winProps = new Properties();
		String filePath = "./src/resources/window.properties";
		try(FileInputStream fin = new FileInputStream(filePath)) 
		{
			//It loads the properties from fin and load it in winProps
			winProps.load(fin);
			String title = winProps.getProperty("window.title");
			String width = winProps.getProperty("window.width");
			String height = winProps.getProperty("window.height");
			System.out.println(title);
			System.out.println(width);
			System.out.println(height);
			int wt = Integer.parseInt(width);
			int ht = Integer.parseInt(height);
			//This logic is use to display a properties details on window
			JFrame appFrame = new JFrame();
			appFrame.setTitle(title);
			appFrame.setSize(wt, ht);
			appFrame.setVisible(true);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
