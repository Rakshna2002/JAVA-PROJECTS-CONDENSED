package bankaccountapp;

public interface IBaseRate {
	 //Methods that returns a base rate
	default double getBaseRate() {
		return 2.5;
	}
}
