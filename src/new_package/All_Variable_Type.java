package new_package;

public class All_Variable_Type {

	int a = 5; // instance variable
	int b = 10;
	static String  c = "Mohan Rameshrao Tawar";  // static variable
	static String d = "city:Nanded";
	public  void Local_Variable() {
		float f = 10.20f; // local variable
		float e = 20.30f;
		System.out.println("Value of addition is = "+ (f+e));
		System.out.println("value of addition is = "+(a+b));
	}
	public static void Static_Variable() {
		
		int a = 30;
		int b = 20;
		System.out.println("Value of a+b = "+(a+b));
		System.out.println("Name : "+ c);
		System.out.println("Address: "+ d);
		
	}
	public static void main(String[]args) {
		int x = 50;
		int y = 30;
		System.out.println("x + y = "+(x+y));
	    System.out.println(c + "\n"+ "address :"+ d);
	    Static_Variable();
	    All_Variable_Type obj = new All_Variable_Type();
	    obj.Local_Variable();
	}
}
