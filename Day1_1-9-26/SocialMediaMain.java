
public class SocialMediaMain {
	
	public static void main(String[] args) {
		SocialMedia fb = new SocialMedia();
		fb.assignValue("Facebook", 5235);
		String fbDetails = fb.retrieveValue();
		System.out.println(fbDetails);
		System.out.println("-------------");
		System.out.println(fb.retrieveValue());
	}
}
