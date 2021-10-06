package exception.handling;

public class ExceptionHandling {
	// uncaught exception
//	int a = 10/0;
	int a = 10;
	//static ExceptionHandling obj;
	//public void exception() {
		//System.out.println(a);
		
		// caught exception
		//Thread.sleep(2000);
	//}
	
	public static void main(String[] args) {
	//	ExceptionHandling obj = new ExceptionHandling();
	//	obj.exception();
		//obj = null;
		//System.out.println(obj);
		//System.out.println(obj.a);
	//	System.out.println(obj.a);
		try {
			int a =9/0;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("hello java");
	}

}
