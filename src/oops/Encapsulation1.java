package oops;

public class Encapsulation1 {
	private double balance;
	public double getbalance() {
		return balance;
	}
	public void Setbalance(double balance)  
	{
		this.balance=balance;
			
	}
	public static void main(String[] args)
	{
		
		Encapsulation1 t = new Encapsulation1();
		t.balance = 1000;
		t.Setbalance(1000000);
		double v=t.getbalance();
		System.out.println(v);
		System.out.println("balance: " + t.getbalance());

		
	}

}
