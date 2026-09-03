package Day3_3_9_26;

public class AbEmployeeMain {

	public static void main(String[] args) {
		AbEmployee[] allEmployees = new AbEmployee[3];
		allEmployees[0] = new AbPermanentEmployee(101, "Ravi Dixit", 75000, 12500, 8500);
		allEmployees[1] = new AbContractualEmployee(102, "Swati Joshi", 60000, 15500);
		allEmployees[2] = new AbPermanentEmployee(103, "Menna Naik", 70000, 9500, 7600);
		
		for(AbEmployee currentEmployee : allEmployees) {
			String empName = currentEmployee.getName();
			float empBasicSalary = currentEmployee.getBasicSalary();
			float processSalary = currentEmployee.processSalary();
			
			System.out.println("Name: " + empName);
			System.out.println("Basic Salary: " + empBasicSalary);
			System.out.println("Gross Salary: " + processSalary);
			System.out.println("---------------------------------");
		}
	}
}
