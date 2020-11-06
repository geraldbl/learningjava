package oop;

public class CDAccount extends BankAccount implements IRate {
	double interestRate;
	
	void compount() {
		System.out.println("Compounding interest");
	}
}
