package exception.handling;

public class ChildClass extends ParentClass{
	// to prevent inheritance if we make parent class as final
	// to prevent method overriding 
	public void start() {
		System.out.println("Child class method");
	}
  
	public static void main(String[]args) {
//		ChildClass obj = new ChildClass();
//		obj.start();
		ParentClass obj = new ParentClass();
	}
}
