package new_package;

public class Instance_Variable {
  
	int a = 100; // instance variable example 
    int b = 100; // we can use in non static method only .
  public void addition() {
	  
	  System.out.println("Value of addition is = "+ (a+b));
  }
  public void minus() {
	  
	  System.out.println("Value of subtraction is = "+ (a-b));
  }
  public void divide() {
	  
	  System.out.println("Value of division is = "+ (a/b) );
  }
  public void multiply() {
	  
	  System.out.println("Value of multiplication is = "+(a*b));
  }
  public static void main(String[]args) {
	  Instance_Variable b = new Instance_Variable();
	  b.addition();
	  b.minus();
	  b.divide();
	  b.multiply();
  }
}
