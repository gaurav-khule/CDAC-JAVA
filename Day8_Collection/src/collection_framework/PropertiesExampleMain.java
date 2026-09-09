package collection_framework;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExampleMain {
	public static void main(String[] args) {

		//This program prints system properties
		Properties sysProps = System.getProperties();
		//it saves key and value in propNames
		Enumeration propNames = sysProps.propertyNames();
		while(propNames.hasMoreElements()) {
			String propName = (String)propNames.nextElement();
			String propValue = sysProps.getProperty(propName);
			System.out.println("Name: " + propName);
			System.out.println("Values: " + propValue);
		}
	}
}
