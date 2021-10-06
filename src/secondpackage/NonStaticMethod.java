package secondpackage;

public class NonStaticMethod {
	public void demo() {
		System.out.println("non static method 1");
		
	}
	public void demo1() {
		System.out.println("non static method 2");
	}
	public static void main(String[]args) {
		System.out.println("we are calling two non static method ");
		NonStaticMethod obj = new NonStaticMethod(); // object creation
		obj.demo(); // we are calling non static method using object.
		obj.demo1();
	}

}
