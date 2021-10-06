package oops;
import java.util.Scanner;
public class Sbi_Bank extends Bank_Account {

	@Override
	public void personal_details() {
		Scanner s = new Scanner(System.in);
		String First_Name;
		String Last_Name;
		long Contact_No;
		String Date_of_Birth;
		String Bld_grp;
		First_Name = s.nextLine();
		Last_Name = s.nextLine();
		Date_of_Birth = s.nextLine();
		Bld_grp = s.nextLine();
		Contact_No = s.nextLong();
		s.close();
		System.out.println(First_Name+" "+Last_Name);
		System.out.println(Date_of_Birth);
		System.out.println(Contact_No);
		System.out.println(Bld_grp);
	}

	@Override
	public void address_details() {
		// TODO Auto-generated method stub
		System.out.println("Here is your address details");
		String house_no = "102A";
		String road = "Laxmi road ";
		String nagar = "Balaji Nagar";
		String society = "Pride Society";
		String city = "Pune";
		
		System.out.println(house_no+"\n"+road+"\n"+nagar+"\n"+society+"\n"+city);
	}

	@Override
	public void account_type() {
		// TODO Auto-generated method stub
		long account_no = 123456789123l;
		System.out.println("Saving Account");
		System.out.println(account_no);
	}

	@Override
	public void atm_request() {
		// TODO Auto-generated method stub
		System.out.println("Visa atm");
	}

	public static void main(String[]args) {
		
		Sbi_Bank s = new Sbi_Bank();
		s.welcome();
		s.personal_details();
		s.address_details();
		s.account_type();
		s.atm_request();
		s.thank_you();
	}
	
}
