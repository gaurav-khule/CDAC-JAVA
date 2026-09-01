
public class PatientMain {

	public static void main(String[] args) {
		Patient pt = new Patient();
		pt.setPatientId("P1");
		pt.setName("Harry");
		pt.setBloodGroup("B+");
		pt.setHeight(165);
		pt.setWeight(63.6f);
		pt.setDiabetic(false);
		
		String ptName = pt.getName();
		boolean diabetic = pt.isDiabetic();
		
		
		System.out.println("---Patient Details------------");
		System.out.println("Patient ID: " + pt.getPatientId());
		System.out.println("Name: " + ptName);
		System.out.println("Blood Group: " + pt.getBloodGroup());
		System.out.println("Patient weight(Kg): " +pt.getWeight() );
		System.out.println("Patient Height(cm): " + pt.getHeight());
		System.out.println("Have Daibetic: " + pt.isDiabetic());
		
		if(diabetic)
			System.out.println("Hello " + ptName + ", you need to start walking");
		else
			System.out.println("Hi " + ptName + ", enjoy you sweets....");
		
		
	}
}
