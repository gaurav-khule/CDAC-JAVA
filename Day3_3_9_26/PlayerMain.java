package Day3_3_9_26;

public class PlayerMain {

	public static void main(String[] args) {
		CricketPlayer crPlayer = new CricketPlayer();
		crPlayer.setName("Virat Kohli");
		crPlayer.setAge(35);
		crPlayer.setRuns(155);
		
		System.out.println("Player Name: " + crPlayer.getName());
		System.out.println("Player Age: "+crPlayer.getAge());
		System.out.println("Runs: " + crPlayer.getRuns());
		System.out.println("==================================");
		
		CricketPlayer crPly2 = new CricketPlayer("Yuraj", 52, 146598);
		System.out.println("Player Name: " + crPly2.getName());
		System.out.println("Player Age: "+crPly2.getAge());
		System.out.println("Runs: " + crPly2.getRuns());
	}
}


