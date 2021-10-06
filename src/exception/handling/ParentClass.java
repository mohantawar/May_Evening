package exception.handling;

public  class ParentClass {
	
	public void start() {
		System.out.println("Parent class method");
	}
    public ParentClass() {
	 
	 // illegal modifier for the constructor in type ParentClass
	  System.out.println("Parent class constructor");
  }
 
}
