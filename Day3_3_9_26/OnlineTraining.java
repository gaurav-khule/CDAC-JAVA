package Day3_3_9_26;

public class OnlineTraining extends Training {
	private String meetingLink;
	
	public OnlineTraining() {
	
	}

	public OnlineTraining(int duration, String moduleName, String meetingLink) {
		super(duration, moduleName);
		this.meetingLink = meetingLink;
	}

	public String getMeetingLink() {
		return meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}	
	
	@Override
	public void conductTraining() {
		System.out.println("Conducting the training on "+ this.getModuleName());
		System.out.println("for " + this.getDuration() + " days");
		System.out.println("at " + meetingLink);
	}
	
	@Override
	public String getDetails() {
		String details = super.getDetails();
		return details + "\nMeeting Link: "+ meetingLink;
	}
}
