package emailapp;
import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String fname=sc.nextLine();
		System.out.println("Enter your last name: ");
		String lname =sc.nextLine();
		Email em1=new Email(fname,lname);
		System.out.println(em1.showInfo());
	}
}
