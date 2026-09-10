package collectionframework2;

public class Department implements Comparable<Department>{
	private int deptNo;
	private String name;
	private int headCount;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Department(int deptNo, String name, int headCount) {
		super();
		this.deptNo = deptNo;
		this.name = name;
		this.headCount = headCount;
	}
	
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeadCount() {
		return headCount;
	}
	public void setHeadCount(int headCount) {
		this.headCount = headCount;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", name=" + name + ", headCount=" + headCount + "]";
	}

	@Override
	public int compareTo(Department secondDepartment) {
		// Provides default sorting algorithms: Name wise Ascending
		String firstName = name; //this.name
		String secondName = secondDepartment.name;
		int comparison = firstName.compareTo(secondName);
		return comparison ;
	}
}
