public class WaterBottleMain {
	public static void main(String[] args) {
		WatterBottle smallBottle = new WatterBottle();
		WatterBottle mediumBottle = new WatterBottle();
		WatterBottle largeBottle = new WatterBottle();
		
		String SBName = smallBottle.make = "Bisleri";
		int SBVolume = smallBottle.volume = 100;
		float SBPrice = smallBottle.price = 5.25f;
		
		System.out.println("Small Bottle Details--");
		System.out.println("Make: "+ SBName) ;
		System.out.println("Volume(ML): "+ SBVolume) ;
		System.out.println("Price(INR): "+ SBPrice) ;
		
		mediumBottle.make = "Aqua";
		mediumBottle.volume = 200;
		mediumBottle.price = 12.25f;
		
		System.out.println("\nMedium Bottle Details--");
		System.out.println("Make: " + mediumBottle.make);
		System.out.println("Volume(ML): " + mediumBottle.volume);
		System.out.println("Price(INR): " + mediumBottle.price);
		
		largeBottle.make = "xyz";
		largeBottle.volume = 500;
		largeBottle.price = 25.65f;
		
		System.out.println("\nLarge bottle Deatials--");
		System.out.println("Make: " + largeBottle.make);
		System.out.println("Volume(ML): " + largeBottle.volume);
		System.out.println("Price(INR): " + largeBottle.price);
	}
}
