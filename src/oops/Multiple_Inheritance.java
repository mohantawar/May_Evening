package oops;

public class Multiple_Inheritance implements Sbicard,Hdfcbank{

	
	public void sbiatm() {

   System.out.println("Use sbi atm card");
		
	}

	
	public void hdfcatm() {

     System.out.println("Use Hdfc atm card");
	}
	
public static void main(String[]args) {
	Multiple_Inheritance m = new Multiple_Inheritance();
	m.sbiatm();
	m.hdfcatm();
}
	
}
