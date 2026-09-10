package java_api_enhancement;

public class RecordClassExample {

	public static void main(String[] args) {
		SimpleTest t1 = new SimpleTest(101, "Automation");
		System.out.println(t1.getTestId());
		System.out.println(t1.getName());
		System.out.println(t1);
		System.out.println("====================");
		AdvanceTest advTest = new AdvanceTest(1001, "UAT");
		AdvanceTest advTest2 = new AdvanceTest(1001, "UAT");
		System.out.println(advTest.equals(advTest2));
		System.out.println(advTest);
		System.out.println(advTest.testId());
	}
}

record AdvanceTest(int testId, String name) {}

class SimpleTest{
	private int testId;
	private String name;
	
	public SimpleTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SimpleTest(int testId, String name) {
		super();
		this.testId = testId;
		this.name = name;
	}
	public int getTestId() {
		return testId;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "SimpleTest [testId=" + testId + ", name=" + name + "]";
	}
	
}