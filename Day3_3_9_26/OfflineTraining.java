package Day3_3_9_26;

public class OfflineTraining extends Training {
	private String venueDetails;

	public OfflineTraining() {
		
	}

	public OfflineTraining(String moduleName, int duration, String venueDetails) {
		super(moduleName, duration);
		this.venueDetails = venueDetails;
	}

	public String getVenueDetails() {
		return venueDetails;
	}

	public void setVenueDetails(String venueDetails) {
		this.venueDetails = venueDetails;
	}
	
	@Override
	public void conductTraining() {
		System.out.println("Conducting the training on "+ this.getModuleName());
		System.out.println("for " + this.getDuration() + " days");
		System.out.println("at " + venueDetails);
	}
	
    @Override
	public String getDetails() {
		String details = super.getDetails();
		return details + "\nVenue: " + venueDetails;
	}
}
