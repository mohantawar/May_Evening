package oops;

public class Family {

	 public static void main(String[]args) {
		 Son obj = new Son();
		 obj.house();
		 obj.car();
		 obj.land();
		 obj.bike();
		 obj.job();
		 System.out.println("-------------------------------------------------");
		 // upcasting 
		 // super class will take back his properties from subclass
		 // there should be inheritance take place before doing upcasting.
		 // In upcasting we take reference of superclass and object of child class or constructor of child class
		 Father f = new Son();
		 f.car();
		 f.house();
		 f.land();
		 obj.land();
		 f.bike(); 
		 f.shares();
		 System.out.println("--------------------------------------------------");
		 //  before performing downcasting 
		 Son b = (Son)f;
		 b.land();
		 b.house();
		 b.car();
		 b.job();
		 b.bike();
		 b.shares();
		 
		 
		 
	 }
	
	
}
