package bankaccountapp;

public class Checking extends Account {
	//Prop specific to Checking acc
	private int debitCardNo;
	private int debitCardPin;
	
	//Constructors to initialize Checking acc prop
	public Checking(String name, String ssn, double initDeposit) {
		super(name,ssn,initDeposit);
		accNum="2"+accNum;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate= getBaseRate() * .15;
	}
	
	private void setDebitCard() {
		debitCardNo=(int)(Math.random()*Math.pow(10, 12));
		debitCardPin=(int)(Math.random()*Math.pow(10, 4));
	}
	
	//Methods specific to Checking acc
	public void showInfo() {
		System.out.println("Account Type: Checking Account");
		super.showInfo();
		System.out.println("Debit Card Number: "+debitCardNo+
				"\nDebit Card Pin: "+debitCardPin);
	}


}
