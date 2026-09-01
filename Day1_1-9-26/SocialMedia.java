
public class SocialMedia {
	private String name;
	private int userCount;
	
	public void assignValue(String v_name, int v_count) {
		name = v_name;
		userCount = v_count;
	}
	
	public String retrieveValue() {
		String data = "Name: " + name + "\nUserCount(Millions): " + userCount;
		return data;
	}
}
