package io_programming;

public class MobileNumber {
	private String countryCode;
	private String MobileNo;
	
	public MobileNumber() {
		super();
	}
	public MobileNumber(String countryCode, String mobileNo) {
		super();
		this.countryCode = countryCode;
		MobileNo = mobileNo;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	
	@Override
	public String toString() {
		return "MobileNumber [INDcountryCode=" + countryCode + ", MobNo=" + MobileNo + "]";
	}
}
