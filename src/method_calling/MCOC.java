package method_calling;

public class MCOC {
	public static void main(String[]args) {
		MCWC obj = new MCWC();
		MCWC.rockstar();
		obj.bollywood();
		Method_overloading m =new Method_overloading();
		m.m1();
		m.m1("hello");
		Method_with_Argument s = new Method_with_Argument();
		s.method1();
		s.method1(100,100);
		s.method2(400,400);
	}

}
