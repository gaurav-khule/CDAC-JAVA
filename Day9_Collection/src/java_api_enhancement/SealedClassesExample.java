package java_api_enhancement;

public class SealedClassesExample {
	public static void main(String[] args) {
		
	}
}

//this class gives permit to only given face and yahoo  
sealed class MessengerService permits facebookMessenger, yahooMessenger{
	
}
non-sealed class facebookMessenger extends MessengerService{
	
}
final class yahooMessenger extends MessengerService{
	
}