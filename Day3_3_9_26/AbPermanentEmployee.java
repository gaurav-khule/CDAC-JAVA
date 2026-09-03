package Day3_3_9_26;

public class AbPermanentEmployee extends AbEmployee {

	private float da,hra;
	
	public AbPermanentEmployee() {
		
	}
	
	public AbPermanentEmployee(int empNo, String name, float basicSalary, float sa, float hra) {
		super(empNo, name, basicSalary);
		this.da = sa;
		this.hra = hra;
	}

	public float getSa() {
		return da;
	}

	public void setSa(float sa) {
		this.da = sa;
	}

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}
	
	@Override
	public float processSalary() {
		float finalSalary = getBasicSalary() + da +hra;
		return finalSalary;
	}
}
