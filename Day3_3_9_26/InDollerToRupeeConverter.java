package Day3_3_9_26;

public class InDollerToRupeeConverter implements CurrencyConverter{
	
	@Override
	public float doConvert(float amountInUSDollars) {
		float amountInIndianRupees = amountInUSDollars * DOLLAR_TO_RUPEE;
		return amountInIndianRupees;
	}
}
