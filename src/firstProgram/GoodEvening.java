package firstProgram;

public class GoodEvening {
   //2. Regular Method 
	// type 1. Static method
	public static void static_method1() {
		System.out.println("This is the static method first");
	}
	public static void static_method2() {
		System.out.println("This is the static method second");
	}
	public static void main(String[]args) {
	GoodEvening.static_method1();
		static_method2();
	}
}
