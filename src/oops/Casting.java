package oops;

public class Casting {
  public void implicit_casting() {
	// primitive casting : implicit ,explicit , boolean
		byte b = -128;  //implicit casting 
		int c = b;   // lower data type into higher data type
		short s = 20000;
		int a = s;
		int i = 100000;
		long g = i;
		System.out.println(c+" "+a+" "+g);
  }
  public void explicit() {
	  long l = 10000000000l;
	  int i = (int)l;
	  float f = 30.49f;
	  int j = (int )f;
	  int a =100;
	  int b = 12;
	  float c = (float) a/b;
	  System.out.println(c);
	  System.out.println(i+" "+j);
  }
	public static void main(String[]args) {
		Casting c = new Casting();
		c.implicit_casting();
		c.explicit();
	}
}
