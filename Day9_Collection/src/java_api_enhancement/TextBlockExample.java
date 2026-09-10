package java_api_enhancement;

public class TextBlockExample {
	public static void main(String[] args) {
		String content = "Today OOP using Java\nmodule\nwill get over\nNew module will been DS";
		System.out.println(content);
		
		
		// Text block
		String anotherContent = """ 
				Java is awesome. 
				Python is great 
				Angular is beautifull...
				""";
		System.out.println(anotherContent);
	}
}
