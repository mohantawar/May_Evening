package firstProgram;

public class StaticMethod extends Foo{
	
	public static void main() {
		System.out.println("Hello method 1");
	}
	public void main() {
		
	}
	public static void main(String[]args) {
		MainMethod m = new MainMethod();
		m.override1();
		MainMethod.override1();
		Foo f = new Foo();
		f.override1();
		Foo.override1();
		m = new Foo();
		m.override1();
		
	}

}
