package new_package;

public class Shift_operator {
	
	public void right_shift() {
		int b = 10;
		int c = 20;
		System.out.println(b>>2);//(10 / 2^2)=2
		System.out.println(c>>2);// (20 / 2^2)=5
		System.out.println(b>>3); // (10 / 2^3) =1
		System.out.println(c>>3); // (20 / 2^3) = 2
		System.out.println(b>>4); // (10 / 2^4) = 0
		System.out.println(c>>4); // (20 / 2^4) = 1
	}
	public void left_shift() {
		int b = 10;
		int c = 20;
		System.out.println(b<<2); // (10*(2^2) = 40
		System.out.println(c<<2); // (20 *(2^2) = 80
		System.out.println(b<<3); // 80
		System.out.println(c<<3); // 160
	}
	

	 public static void main(String[]args) {
		 Shift_operator s = new Shift_operator();
		 s.right_shift();
		 s.left_shift();
	 }
}
