package Day3_3_9_26;

public class AbContractualEmployee extends AbEmployee {
	
	private float variablePay;
	
	
	public AbContractualEmployee() {
		
	}
	
	public AbContractualEmployee(int empNo, String name, float basicSalary, float variablePay) {
		super(empNo, name, basicSalary);
		this.variablePay = variablePay;
	}

	public float getVariablePay() {
		return variablePay;
	}

	public void setVariablePay(float variablePay) {
		this.variablePay = variablePay;
	}

	@Override
	public float processSalary() {
		float finalSalary = getBasicSalary() + variablePay;
		return finalSalary;
	}

}
