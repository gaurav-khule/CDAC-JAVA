package Day3_3_9_26;

public class InRupeeToPoundConverter implements CurrencyConverter {

	@Override
	public float doConvert(float amountInIndianRupee) {
		float amountInPounds = amountInIndianRupee / POUND_TO_RUPEE;
		return amountInPounds;
	}
}
