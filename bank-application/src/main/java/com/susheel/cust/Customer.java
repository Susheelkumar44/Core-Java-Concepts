package com.susheel.cust;

import com.susheel.bank.BankAccount;
import com.susheel.bank.CurrentAccountV2;
import com.susheel.bank.SavingsAccount;
import com.susheel.bank.SavingsAccountV2;
public class Customer {
	public static void main(String args[])
	{
		BankAccount acc1=null;
		acc1=new SavingsAccount();
		acc1.withdraw(4000);
		SavingsAccountV2 acc=new SavingsAccountV2();
		String iName=acc.getInsurancename();
		System.out.println("Savings Account Insurance name: "+iName);
		String iType=acc.getInsuranceType();
		System.out.println("Savings Account Insurance type: "+iType);
		System.out.println("Savings Account Insurance amount: "+acc.getInsuranceAmount());
		CurrentAccountV2 accV2=new CurrentAccountV2();
		String iNameCa=accV2.getInsurancename();
		System.out.println("Current Account Insurance name: "+iNameCa);
		String iTypeCa=accV2.getInsuranceType();
		System.out.println("Current Account Insurance type: "+iTypeCa);
		System.out.println("Current Account Insurance amount: "+accV2.getInsuranceAmount());
	}
}











//cc.disp();
		//BankAccount acc2=new BankAccount();
		/*SavingsAccount sav=new SavingsAccount("ABCD",5500);
		sav.deposit(4000);
		double balOfacc1=acc1.getAccountBalance();
		System.out.println("Bank Account1 "+acc1);*/
		//System.out.println("Balance of acc2 "+balOfacc1);
	//	BankAccount acc3=acc1;
		/*acc1.withdraw(5000);
		acc2.deposit(4000);
		double balOfacc1=acc1.getAccountBalance();
		double balOfacc2=acc2.getAccountBalance();
		acc1.setAccountHolderName("susheel");
		acc2.setAccountHolderName("Capgemini");
		System.out.println("Balance of acc1 "+balOfacc1);
		System.out.println("Balance of acc2 "+balOfacc2);
		System.out.println("Bank Account1 "+acc1);
		System.out.println("Bank Account2 "+acc2);
	//	System.out.println("Bank Account3 "+acc3);
	}*/