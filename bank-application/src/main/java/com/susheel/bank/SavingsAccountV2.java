package com.susheel.bank;

public class SavingsAccountV2 extends SavingsAccount implements insurance {

	public String getInsurancename() {
		
		return "JeevanSuraksha";
	}
	public int getInsuranceAmount() {
		
		return 500000;
	}
	public String getInsuranceType() {
		
		return "Normal";
	}
}
