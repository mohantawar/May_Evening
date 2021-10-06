package oops;

public class Compile_Time_Polymorphism {
	
	public void area(int a,int b) 
	{
		int result = a*b;
		System.out.println(result);
	}
  public void area(int a) {
	  int area_of_circle = a*a;
	  System.out.println(area_of_circle);
  }
  public static void main(String[]args) {
	  Compile_Time_Polymorphism b = new Compile_Time_Polymorphism();
	  b.area(10);
	  b.area(10, 10);
  }
}
