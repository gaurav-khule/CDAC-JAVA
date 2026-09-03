package Day3_3_9_26;

public class TrainingMain {

	public static void main(String[] args) {
		OfflineTraining offline = new OfflineTraining("OOP using Java",9,"CDAC,Nashik");
		OnlineTraining online = new OnlineTraining(5,"SQL","https://meet.google.com/1234");
		
		offline.conductTraining();
		System.out.println("==============");
		online.conductTraining();
		
		System.out.println("------------------------");
		System.out.println(offline.getDetails());
		System.out.println(online.getDetails());
		
	}
}
