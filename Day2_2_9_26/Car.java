package Day2_2_9_26;

public class Car {
	//description, price, engine, music system
	private String description;
	private int price;
	
	private Engine engineData;
	private MusicSystem musicSystemData;
	
	//new Car()
	public Car() {
		description = "Hyundai i20";
		price = 965000;
		engineData = new Engine();
		// Not initializing music system data bcoz by default Car does not have it
	}

	public Car(String description, int price, Engine engineData, MusicSystem musicSystemData) {
		super();
		this.description = description;
		this.price = price;
		this.engineData = engineData;
		this.musicSystemData = musicSystemData;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Engine getEngineData() {
		return engineData;
	}

	public void setEngineData(Engine engineData) {
		this.engineData = engineData;
	}

	public MusicSystem getMusicSystemData() {
		return musicSystemData;
	}

	public void setMusicSystemData(MusicSystem musicSystemData) {
		this.musicSystemData = musicSystemData;
	}
}
