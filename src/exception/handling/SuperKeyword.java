package exception.handling;

public class SuperKeyword extends Constructor_Super_keyword{
	
	public  SuperKeyword() {
		super(); // we can have only one super keyword in  a single constructor
		System.out.println("Default constructor of child");
	}
	public  SuperKeyword(int i) {
		super(i); // we can have only one super keyword in  a single constructor
		
	}
	
	public  SuperKeyword(int i,int j) {
		super(i,j);
		
	}

	 public static void main(String[]args) {
		 SuperKeyword obj = new  SuperKeyword();
		 SuperKeyword obj1 = new  SuperKeyword(10);
		 SuperKeyword obj2 = new  SuperKeyword(10,20);
		 
	 }
}
