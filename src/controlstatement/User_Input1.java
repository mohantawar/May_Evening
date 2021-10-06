package controlstatement;
import java.util.Scanner;
public class User_Input1 {

	public void addition(int a,int b) {
		
		int sum;
		sum = a+b;
		System.out.println("value of addition="+sum);
	
	}
	public void minus(int a,int b) {
		
		int subtraction ;
		subtraction = a-b;
		System.out.println("value of subtraction ="+subtraction);
	}
	public void division(float a,float b) {
		
		float division;
		division = a/b;
		System.out.println("value of division = "+division);
	}
	public void multiplication(int a,int b) {
		
		int c;
		c = a*b;
		System.out.println("value of multiplication = "+c);
	}
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		User_Input1 obj = new User_Input1();
		 String  operation;
		 System.out.println("Please Enter your operation");
		  operation = sc.nextLine();
		 switch(operation) {
		 case "addition":
			 obj.addition(5,5);
			 break;
		 case "subtraction":
			 obj.minus(10,5);
			 break;
		 case "division":
			 obj.division(10.0f, 2.5f);
			 break;
		 case "multiplication":
			 obj.multiplication(10, 5);
			 break;
		default:
			System.out.println("No operation");
		 }
		 
	}
	
	
	
	
	
	
	
}
