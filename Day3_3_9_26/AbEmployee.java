package Day3_3_9_26;

public abstract class AbEmployee {
	private int empNo;
	private String name;
	private float basicSalary;
	                                           
	public AbEmployee() {
	
	}

	public AbEmployee(int empNo, String name, float basicSalary) {
		this.empNo = empNo;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public abstract float processSalary();
}
