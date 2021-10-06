package new_package;

public class Non_Static {

	public void first() {
		System.out.println("Here is first non static method");
	}
public void second() {
	System.out.println("Here is the second non static method");
	
}
public static void main(String[]args) {
	System.out.println("Non static method calling");
	Non_Static obj = new Non_Static(); // obj is object here
	obj.first();
	obj.second();
}
}
