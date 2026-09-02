package Day2_2_9_26;

public class CarMain {

	public static void main(String[] args) {
		Car simpleCar, premiumCar;
		/*
		 * Simple car does not have music system and it has an engine with very basic specification
		 * 
		 * premiumCar has a music system also and it has a powerful engine.
		 * */
		
		simpleCar = new Car();
		System.out.println(simpleCar.getDescription());
		System.out.println(simpleCar.getPrice());
		
		//Print power of engine insatlled in simpleCAr
		//Obtain the Engine insatlled in simpleCAr
		
		//Using Explicit Reference
		Engine simpleEngine = simpleCar.getEngineData();
		String simplePower = simpleEngine.getPower();
		System.out.println(simplePower);
		
		String simpleType = simpleEngine.getType();
		System.out.println(simpleType);
		
		//Using Object Graph Navigation
		System.out.println("--"+simpleCar.getEngineData().getPower());
		System.out.println("--"+simpleCar.getEngineData().getType().toUpperCase());
		System.out.println("==========================================");
		
		Engine premiumEngine = new Engine("Diesel","3600CC");
		MusicSystem premiumMusicSystem = new MusicSystem("Bose", "Ultra Base with 8D sound");
		premiumCar = new Car("Defender", 25000000, premiumEngine, premiumMusicSystem);
		System.out.println(premiumCar.getDescription());
		System.out.println(premiumCar.getPrice());
		
		//Using Explicit Reference for Premium Car
		Engine preEngine = premiumCar.getEngineData();
		String premiumPower = preEngine.getPower();
		System.out.println(premiumPower);
		String premiumType = premiumEngine.getType();
		System.out.println(premiumType);
		
		
		//In case of aggregation (weak dependency) we do not use Object Graph Navigation  
		//Print power of engine installed in premium Car
		System.out.println("--"+premiumCar.getEngineData().getPower());
		
		//Print sound effect of music system insatlled in premiumCar
		
		/*
		System.out.println(premiumCar.getMusicSystemData().getSoundEffect());
		*/
		
		//Using Ec
		MusicSystem currenMusicSystem = premiumCar.getMusicSystemData();
		if(currenMusicSystem != null) {
			String currentSoundEffect = currenMusicSystem.getSoundEffect();
			System.out.println(currentSoundEffect);
		}else {
			System.out.println("This car does not have any music system installed");
		}
	}
}
