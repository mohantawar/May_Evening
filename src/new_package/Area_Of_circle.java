package new_package;

public class Area_Of_circle {

	float pi;
	float radius;

	public Area_Of_circle() {
		
		pi = 3.14f;
		radius = 100;
		double area = pi* radius*radius;
		System.out.println("Area of non argument constructor: "+area);
		
	}
	
public Area_Of_circle(float f,float r) {
		
		pi = f;
		radius = r;
		double area = pi* radius*radius;
		System.out.println("Area of  argument constructor: "+area);	
	}
 public static void main(String[]args) {
	 new Area_Of_circle();
	 new Area_Of_circle(3.14f,10.0f);
 }
	
}
