package oop;

public class BankAccount implements IRate {
	//Define variables
	private static final String routingNumber = "0123456"; //constant
	// instance variable
	private String accountNumber;
	private String name;
	private String ssn;
	String accountType;
	double balance;
	
	//Constructor
	BankAccount() {
		System.out.println("New Acc Created");
	}
	
	BankAccount(String accountType) {
		System.out.println("New " + accountType + " Created");
		this.accountType = accountType;

	}
	
	//interface methods
	public void setRate() {
		System.out.println("Setting rate");
	}
	
	public void increaseRate() {
		System.out.println("Increasing rate");

	}
	
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	//Define methods
	public void deposit(double Amount) {
		balance = balance + Amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double Amount) {
		balance = balance - Amount;
		showActivity("Withdraw");

		
	}
	
	//can only be called from within the class itself
	private void showActivity(String action) {
		System.out.print(action + "|");
		System.out.println("new balance:" + balance);
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}
}
