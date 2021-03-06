package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("63564564563", 1000);
		BankAccount acc2 = new BankAccount("63777435563", 3000);
		acc1.setName("Gerald");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(200);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest {
	private static int iD = 1000;
	private String accountNumber;
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance;
	
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		System.out.println("New Account Created");
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0,1);
		System.out.println(accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("New balance: " + balance);
	}
	

	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "NAME:" + name + "\n" + accountNumber + "|BALANCE:" + balance;
	}
}