package method_calling;

public class Method_with_Argument {
	public void method1() {
		int a = 10;
		int b = 20;
		int sum = a +b ;
		System.out.println("result is= "+sum);
	}
	public void method2(int a,int b) {
		int sum = a + b;
		System.out.println("result is= "+sum);
	}
	public void method1(int a,int b) {
		int sum = a +b;
		System.out.println("result of sum is= "+sum);
	}
    public static void main(String[]args) {
    	Method_with_Argument b = new Method_with_Argument();
    	b.method1();
    	b.method1(100,200);
    	b.method2(500,500);
    	
    }
}
