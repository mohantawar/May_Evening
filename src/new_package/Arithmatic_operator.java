package new_package;

public class Arithmatic_operator {
	public void all_in_one() {
		int a =10;
		int b =5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // it gives perfect divison
		System.out.println(a%b); // it gives remainder
	}
	
	public static void main(String[]args) {
		Arithmatic_operator a = new Arithmatic_operator();
		a.all_in_one();
	}

}
