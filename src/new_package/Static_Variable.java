package new_package;

public class Static_Variable {
	static int a = 10;
	static int b = 20;
	
	public static void addition() {
		
		System.out.println("Value of addition is = "+(a+b));
	}
   public static void minus() {
	   
	   System.out.println("Value of subtraction is = "+(a-b));
   }
   public void divide() {
	   
	   System.out.println("Value of division is = "+ (a/b));
   }
   public static void main(String[]args) {
	   
	   addition();
	   minus();
	   Static_Variable b = new Static_Variable();
	   b.divide();
   }
}
