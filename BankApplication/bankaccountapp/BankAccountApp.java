package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts=new LinkedList<Account>();
		String file= "assets\\New_Bank_Accounts.csv";

		//Read CSV file then create new accs based on it
		List<String[]> newAccHolders=utilities.CSV.read(file);
		for(String[] accHolder:newAccHolders) {
			String name=accHolder[0];
			String ssn=accHolder[1];
			String accountType=accHolder[2];
			double initDeposit=Double.parseDouble(accHolder[3]);	
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name,ssn,initDeposit));
		
			}else if(accountType.equals("Checking")) {
				accounts.add(new Checking(name,ssn,initDeposit));
			}else {
				System.out.println("ERROR IN READING ACCOUNT TYPE");
			}
		}
		
		for(Account acc:accounts) {
			System.out.println("*************************************\n");
			acc.showInfo();
			System.out.println("\n");
		}
		
	}

}
