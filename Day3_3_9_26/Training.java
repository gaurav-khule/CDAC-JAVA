package Day3_3_9_26;

public class Training {
	private String moduleName;
	private int duration;
	
	//No-Arg Constructor
	public Training() {
		
	}
	
	//Para (String, int)
	public Training(String moduleName, int duration) {
		super();
		this.moduleName = moduleName;
		this.duration = duration;
	}

	//Para (int, String)
	public Training(int duration, String moduleName) {
		super();
		this.duration = duration;
		this.moduleName = moduleName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	//Method created = This is an empty method
	//Example of Replacement
	public void conductTraining() {
		
	}
	
	//Example of Extension
	public String getDetails() {
		String details = "Module: " + moduleName +
						"\nDuration(days): " + duration;
		
		return details;
	}
}
