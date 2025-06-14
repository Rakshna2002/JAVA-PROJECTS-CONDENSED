package bankaccountapp;

/**
 * 
 */
public abstract class Account implements IBaseRate {
	//Props for all acc
	private String name;
	private String ssn;
	private double balance;
	private static int index=10000;
	protected String accNum;
	protected double rate;
	
	//constructors to set and initialize base acc
	public Account(String name,  String ssn, double initDeposit) {
		this.name=name;
		this.ssn=ssn;
		balance=initDeposit;
		//Set Account number
		index++;
		this.accNum=setaccNum();
		setRate();
	}
	
	public abstract void setRate();
	
	private String setaccNum() {
		String last2of4=ssn.substring(ssn.length()-2, ssn.length());
		int uniqueID=index;
		int randomNum=(int)(Math.random()*Math.pow(10, 3));
		return last2of4+uniqueID+randomNum;
	}
	
	public void compound() {
		double accruedInterest= balance*(rate/100);
		balance=balance+accruedInterest;
		System.out.println("Accured Interest : $"+ accruedInterest);
		printBal();
	}
	
	//List common methods
	
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Depositing $"+amount);
		printBal();
	}
	
	public void withdraw(double amount){
		balance=balance-amount;
		System.out.println("Withdrawing $"+amount);
		printBal();
	}
	
	public void transfer(String toWhom, double amount) {
		balance=balance-amount;
		System.out.println("Transfering $"+amount+" to "+ toWhom);
		printBal();
	}
	
	public void printBal() {
		System.out.println("Balance: $"+balance);
	}
	public void showInfo() {
		System.out.println(
				"Name: "+name+
				"\nAccount Number: "+accNum+
				"\nBalance: "+balance+
				"\nRate: " + rate + "%");
	}
}
