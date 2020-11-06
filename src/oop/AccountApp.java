package oop;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanAccount la = new LoanAccount();
		la.setRate();
		la.increaseRate();
		la.setAmmortSchedule();
		la.setTerm(20);
		
		//polymorphism
		IRate account1 = new LoanAccount();
		account1.increaseRate();
	}

}
