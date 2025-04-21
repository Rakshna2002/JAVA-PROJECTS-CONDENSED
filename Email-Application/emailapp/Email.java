package emailapp;

import java.util.Scanner;

public class Email {
	private String fname;
	private String lname;
	private String password;
	private String dept;
	private String email;
	private int mailBoxCapacity=500;
	private int defaultpasswordLength=10;
	private String alternativeEmail;
	private String companySuffix = "rp.com";
	
	//constructor to receive fname and lname
	public Email(String fname, String lname) {
		this.fname=fname;
		this.lname=lname;
		//System.out.println("Email created: "+ this.fname + " " + this.lname);
		
		//Call a method asking for a dept and then return it
		this.dept=setDept();
		//System.out.println("Department: "+ this.dept);
		
		//Call a method to return a random password
		this.password=randPass(defaultpasswordLength);
		//System.out.println("Your Password: " + this.password);
		
		//Combine elements to generate email
		email=fname.toLowerCase()+"."+ lname.toLowerCase()+ "." + dept+ "@"+ companySuffix;
		//System.out.println("Your email: "+ email);
	}
	
	//Ask for dept
	private String setDept(){
		System.out.println("New worker: " + fname + "\nDept Codes\n1 for Sales \n2 for Dev-Ops \n3 for Accounting \n0 None\nEnter the department:");
		Scanner sc=new Scanner(System.in);
		int deptChoice=sc.nextInt();
		if(deptChoice==1) { return "sales"; }
		else if(deptChoice==2) { return "dev"; }
		else if(deptChoice==3) { return "acc"; }
		else {return "nan";}
	}
	
	//Generate a rand password
	private String randPass(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmopqrstuvwxyz0123456789!@#$%";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}

	
	//Set mailbox capacity
	public void setMailCapa(int capa) {
		this.mailBoxCapacity=capa;
	}
	
	//Set alternative email
	public void setAltEmail(String altEmail) {
		this.alternativeEmail=altEmail;
	}
	
	//Change the password
	public void changePass(String pass) {
		this.password=pass; 
	}
	
	public int getMailboxcapa(){ return mailBoxCapacity; }	
	public String getAltEmail(){ return alternativeEmail; }
	public String getPassword(){ return password; }
	
	public String showInfo(){
		return "---------Display Info---------" +
				"\nName: " + fname +" " + lname +
				"\nCompany email: " + email +
				"\nPassword: " + password +
				"\nMailBox Capacity: " + mailBoxCapacity + " MB";
	}
}
