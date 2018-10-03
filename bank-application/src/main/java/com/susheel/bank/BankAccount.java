package com.susheel.bank;

/** this comment is documentation based comment
 * 
 * @author sushes
 * @since 03-10-2018
 *
 */

public abstract class BankAccount {
	int accountNo;
	String accountHolderName;
	double accountBalance;
	/**
	 * static variable are created in separate area other than stack and heap, it is method area.
	 * two different objects share same property through static variable because it is initialized only once. 
	 */
	static int autoAccountNoGen;
	
	/**
	 * Irrespective of default or parameterized constructot is initalized, code written init block is 
	 * executed.
	 */
	{
		accountNo=++autoAccountNoGen;
	}
	/** Default constructor along with parameterized constructors exhibiting constructor overloading 
	 * which is not a part of polymorphism.
	 * 
	 */
	public BankAccount(){
		
		accountHolderName="Unknown";
		accountBalance=0;
	}
	/** for conceptual explanation only
	 */
	/*public BankAccount(int accountNo, String accountHolderName, double accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}*/

	public BankAccount(String accountHolderName, double accountBalance) {
		super();
		//accountNo=++autoAccountNoGen;Generates accountNo automatically
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}
	/**
	 * Below is a method which defines behavior of the object
	 * Methods changes the state of the object
	 * @param amount
	 */
	public abstract void withdraw(double amount);
	
	public void deposit(double amount)
	{
		accountBalance+=amount;
	}
	
	
}
