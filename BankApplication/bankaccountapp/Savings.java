package bankaccountapp;

public class Savings extends Account{
	//Prop specific to Savings acc
	private int safetyDepositBoxID;
	private int safetyDepositBoxPin;
	
	//Constructors to initialize saving acc prop
	public Savings(String name, String ssn, double initDeposit) {
		super(name,ssn,initDeposit);
		accNum="1"+accNum;
		setSafetyDepositBox();
	}
	
	public void setRate() {
		rate= getBaseRate() -.25;
	}
	
	public void setSafetyDepositBox() {
		safetyDepositBoxID=(int)(Math.random()*Math.pow(10, 3));
		safetyDepositBoxPin=(int)(Math.random()*Math.pow(10, 4));
	}
	
	
	//Methods specific to saving acc
	public void showInfo() {
		System.out.println("Account Type: Saving Account");
		super.showInfo();
		System.out.println("Safety Deposit Box ID: " + safetyDepositBoxID);
		System.out.println("Safety Deposit Box Pin: " + safetyDepositBoxPin);
	}

}
