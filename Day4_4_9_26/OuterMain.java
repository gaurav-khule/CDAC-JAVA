package Day4_4_9_26;

import Day3_3_9_26.CurrencyConverter;
import Day3_3_9_26.InDollerToRupeeConverter;
import Day3_3_9_26.InRupeeToPoundConverter;

public class OuterMain {

	public static void main(String[] args) {
		
		//Inner class 
		Outer.StaticInner staticInnterRef = new Outer.StaticInner();
		staticInnterRef.print();
		System.out.println("---------------------------------");
		
		//Nested class
		Outer outerRef = new Outer(); // Object created of outer class
		Outer.Nested nestedRef= outerRef.new Nested();
		nestedRef.display();
		/*
		   Another way to call nested class
		   Outer.Nested nestedRef = new Outer().new Nested();
		*/
		
		//Local class 
		System.out.println("---------------------------------");
		outerRef.showMesage();	
		
		//Anonymous class
		System.out.println("---------------------------------");
		//Converting Dollar to INR
		CurrencyConverter forex;
		forex = new InDollerToRupeeConverter();
		System.out.println("USD to INR: "+forex.doConvert(10000));
		//Converting 10000000 INR to GBP
		forex = new InRupeeToPoundConverter();
		System.out.println("INR to Pound: " + forex.doConvert(10000000));
		
		System.out.println("====================");
		
		//Converting 5000 ZKW to INR
		forex = new CurrencyConverter() {
			@Override
			public float doConvert(float amountInKwacha) {
				return amountInKwacha * 4.95f;
			}
		};
		System.out.println("Amount in Kwacha: "+forex.doConvert(5000));
		
		System.out.println("====================");
		
		//Converting 50000 INR to JPY
		forex = new CurrencyConverter() {
			@Override
			public float doConvert(float amountInYen) {
				return amountInYen / 1.7f;
			}
		};
		System.out.println("YEN to INR: " + forex.doConvert(50000));
	}
}
