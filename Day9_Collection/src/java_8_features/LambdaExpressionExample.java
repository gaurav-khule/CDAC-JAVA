package java_8_features;

public class LambdaExpressionExample {
	public static void main(String[] args) {
		Greet gr = ()-> System.out.println("Welcome to lambda expression");
		gr.doGreet();
		Greet gr2 = ()-> System.out.println("Hii");
		gr2.doGreet();
		Greet gr3 = ()-> {
			String msg = "How you doingg..";
			System.out.println(msg);
		};
		gr3.doGreet();
		
		//--------------------------------------------------------------------
		
		System.out.println("--------------------");
		StringProcessor upper = (String name) -> System.out.println(name.toUpperCase());
		upper.doProcess("james");
		
		StringProcessor lower = (nm) -> System.out.println(nm.toLowerCase());
		lower.doProcess("JACK");

//		If type is inferred and there is only one para () is optional
//		StringProcessor lower = nm -> System.out.println(nm.toLowerCase());
//		lower.doProcess("JACK");
		
//		--------------------------------------------------------------------
		
		Calculator adder = (x,y)-> x+y;
		System.out.println(adder.doCalculate(5, 10));
		
		Calculator multiplier = (p,q)-> {
			int result = p*q;
			return result;
		};
		System.out.println(multiplier.doCalculate(10, 3));
		
	}
}

interface Greet{
	void doGreet();
}

interface StringProcessor {
	void doProcess(String str);
}

interface Calculator {
	int doCalculate(int a, int b);
}