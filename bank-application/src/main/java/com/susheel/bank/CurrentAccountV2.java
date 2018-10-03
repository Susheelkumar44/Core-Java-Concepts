package com.susheel.bank;

public class CurrentAccountV2 extends CurrentAccount implements insurance {
	
public String getInsurancename() {
		
		return "JeevanBheema";
	}
	public int getInsuranceAmount() {
		
		return 4500000;
	}
	public String getInsuranceType() {
		
		return "Special";
	}
}
