package exception.handling;

public class FinallyConcept {
	public static void  main(String[]args) {
		//test1();
		//test2();
	//	test3();
		test4();
	}
	
	public static void test1() {
		try {
			System.out.println("inside test1 try block");
			throw new RuntimeException("test");
		}
		catch(Exception e) {
			System.out.println("inside catch block");
		}
		finally {
			System.out.println("inside finally block");
		}
	}
	public static void test2() {
		
		try {
			System.out.println("inside test2 try block");
			throw new RuntimeException("test2");
		}
		finally {
			System.out.println("inside finally block of test2");
		}
	}
	public static void test3() {
		try {
			System.out.println("inside test3 try block");
			
		}
		finally {
			System.out.println("inside finally block of test3");
		}
	}
	public static void test4() {
		int i =10;
		try {
			System.out.println("inside test4 try block");
	        int k = i/0;
		}
		catch(NullPointerException e) {
			System.out.println("inside catch block");
		}
		finally {
			System.out.println("inside finally block of test4");
		}
	}

}
