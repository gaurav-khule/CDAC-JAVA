package programming_essentials;

public class Person {
	private String name;
	private Nationality nationality;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Nationality nationality) {
		super();
		this.name = name;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Nationality getNationality() {
		return nationality;
	}

	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}
	
	
	 
}
