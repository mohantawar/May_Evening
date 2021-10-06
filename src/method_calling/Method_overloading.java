package method_calling;

public class Method_overloading {
	public void m1() {
		System.out.println("this is m1 method ");
	}
	public void m1(String s) {
		System.out.println("this is overloaded method");
		
	}
	public static void main(String[]args) {
		Method_overloading m = new Method_overloading();
		m.m1();
		m.m1("Main method calling");
	}

}
