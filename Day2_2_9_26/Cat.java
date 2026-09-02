package Day2_2_9_26;

public class Cat {
	private int catID;
	private String name;
	private String breed;
	private String color;
	private float age;
	
	//Generate by eclipse
	public Cat() {
		catID = 1;
		name = "Jerry";
		breed = "Lasa";
		color = "Grey";
		age = 3.5f;
	}
	
	//Auto generate 
	public Cat(int catID, String name, String breed, String color, float age) {
//		super();
		this.catID = catID;
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	
		//Auto generated
		public Cat(String name, String breed, String color, int catID, float age) {
		super();
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.catID = catID;
		this.age = age;
	}


//	public Cat() { // No_argumrnt constructor
//		catID = 1;
//		name = "Jerry";
//		breed = "Lasa";
//		color = "Grey";
//		age = 3.5f;
//	}
//	
//	public Cat(int id, String nm, String br, String clr, float ag) {
//		// Parameterized constructor 
//		catID = id;
//		name = nm;
//		breed = br;
//		color = clr;
//		age = ag;
//	}
//	
//	public Cat(String nm, float ag, int id, String br, String clr ) {
//		// Parameterized constructor 
//		catID = id;
//		name = nm;
//		breed = br;
//		color = clr;
//		age = ag;
//	}
	
	
	public int getCatID() {
		return catID;
	}
	public void setCatID(int catID) {
		this.catID = catID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	public void walk() {
		String myData = 
				"Hi all, I am " + name + 
				"\nMy Id: " + catID + 
				"\nMy breed: " + breed +
				"\nMy color: " + color + 
				"\nI am " + age + " year old," + "\nand I am walking in my own style";
		System.out.println(myData);
	}
}
