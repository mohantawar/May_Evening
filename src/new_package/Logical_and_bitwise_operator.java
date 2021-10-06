package new_package;

public class Logical_and_bitwise_operator {

	public void logical_and() {
		int a = 20;
		int b = 10;
		System.out.println(a>b && b<a); // true && true = true
		System.out.println(b>a && a<b); // false &&     = false
		System.out.println(a>b && b>a); // true && false = false
		System.out.println(a<b && b>a); // false &&      = false
		System.out.println(a>b & b>a);  // true & false = false 
		System.out.println(a<b & b<a);  // false & true = false
	}
	public void logical_or() {
		
		int a = 10;
		int b = 20;
		System.out.println(a>b || b<a); // false || false
		System.out.println(a<b || b>a); // true || true 
		System.out.println(a>b | b<a);  // false | false 
	}
	public static void main(String[]args) {
		Logical_and_bitwise_operator op = new Logical_and_bitwise_operator();
		op.logical_and();
		op.logical_or();
	}
}
