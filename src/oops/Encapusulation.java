package oops;

public class Encapusulation {

	private int a ;
	private int b ;
	
	public void setVariable(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public int sum() {
	return a+b;
	}
	public int getvalue() {
		return a;
	}
	public int getvalue2() {
		return b;
	}
	public static void main(String[]args) {
		Encapusulation e = new Encapusulation();
		e.setVariable(10, 20);
	int a = 	e.getvalue();
	int b = 	e.getvalue2();
	System.out.println(a+" "+b);
	int c = e.sum();
	System.out.println(c);
	}
}
