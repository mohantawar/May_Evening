package oops;

abstract public class Bank_Account {

	public void welcome() {
		System.out.println("Welcome to our bank");
	}
	abstract public void  personal_details();
	abstract public void address_details();
	abstract public void account_type();
	abstract public void atm_request();
	public void thank_you() {
		System.out.println("Thank you for choosing us");
	}
}
