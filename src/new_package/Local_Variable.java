package new_package;

public class Local_Variable {
	public static void addition() {
		int a = 10;
		int b = 20;
		System.out.println("The addition is = " + (a+b));
	}
public void concatenation() {
	String a = "Mohan";
	String b = "Tawar";
	System.out.println("Name : "+ a +" " + b);
}
public  void minus() {
	int a = 100;
	int b = 100;
	System.out.println("subtraction is = "+ (a-b));
}
public static void main(String[]args) {
	addition();
	Local_Variable b = new Local_Variable();
	b.concatenation();
	b.minus();
	
}

}
