package string_and_stringbuilder;

public class StringBuilderMain {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();  // Creates an empty builder
		sb.append("Current time is ");
		sb.append(5.25); // double
		sb.append(" pm. \nToday ");
		sb.append(4);//int
		sb.append(" topics are coverd. \nJava is simple right? : ");
		sb.append(true); // boolean
		System.out.println(sb); // call by implicit means automatically 
		
		System.out.println("-------------------------------------");
		//Call by explicit by adding toString() method
		String finalData = sb.toString();
		System.out.println(finalData);
		
		
	}
}
