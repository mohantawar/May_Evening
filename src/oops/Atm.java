package oops;

public class Atm implements Hdfcbank{

	
	public static void main(String[]args) {
		Atm m = new Atm();
		m.sbiatm();
		m.hdfcatm();
	}

	
	public void sbiatm() {
		
		System.out.println("withdraw money using sbi atm card");
	}

	
	public void hdfcatm() {
		System.out.println("withdraw money using hdfc atm card");
		
	}
}
