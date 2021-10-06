package new_package;

public class Unary_operator {
	public void unary_method() {
		
		 int i = 10;
		 System.out.println(i); // 10
		 System.out.println(i++); // 10 postfix ( i= i+1)
		 System.out.println(i); // 11
		 System.out.println(i--);// 11
		 System.out.println(i);//10
	}
	public void prefix() {
		int i =10;
		System.out.println(i); // 10
		System.out.println(++i);// it changes value first 11
		System.out.println(--i); // prefix 10
		System.out.println(i);//10
	}
	public void others() {
		
		int i =10;
		boolean b = true;
		System.out.println(+i);//10
		System.out.println(i);//10
		System.out.println(-i);// -10
		System.out.println(i);//10
		System.out.println(~i);//-11
		System.out.println(!b);
			
	}
	public static void main(String[]args) {
		Unary_operator u = new Unary_operator();
		u.unary_method();
		u.prefix();
		u.others();
	}

}
