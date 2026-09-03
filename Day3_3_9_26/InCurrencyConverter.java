package Day3_3_9_26;

public class InCurrencyConverter {

	public static void main(String[] args) {
		CurrencyConverter forex;
		forex = new InDollerToRupeeConverter();
		float inr = forex.doConvert(5000);
		System.out.println("$5000 : Rs."+inr);
		System.out.println("--------------------------");
		forex = new InRupeeToPoundConverter();
		float pound = forex.doConvert(2575000);
		System.out.println("Rs.2575000 : GBP."+pound);
	}
}
