package controlstatement;

public class Nested_If_Else {
	public void nested_if_else() {
		int marks = 39;
		if(marks>=70) {
			System.out.println(" A grade");
		}
		else if(marks>=60 && marks<70) {
			System.out.println(" B grade");
		}
		else if(marks>=50 && marks<60) {
			System.out.println(" C grade");
		}
		else if (marks>=40 && marks<50) {
			System.out.println(" D grade");
		}
		else {
			System.out.println(" F grade");
		}
		
	}
	public void nested_else() {
		int sum = 0;
		int a =10;
		int b = 10;
		if(a>0) {
			if(b>0) {
				System.out.println("a is positive number");
				sum = a+b;
				System.out.println("sum is ="+(a+b));
			}
			else {
				System.out.println("b is negative number");
			}
		}
		else {
			System.out.println("a is negative no");
		}
	}
	public void switch_case() {
		int a =1;
		switch(a) {
		case 0:
			System.out.println("first case statement");
			break;
		case 1:
			System.out.println("second  case statement");
			//break ;
		default :
			System.out.println("default case statement");
		}
	}
	public void nested_if(String password,String confirm_password) {
		
		
		
		if(password == "mohan@2830") {
			if(confirm_password=="mohan@2830") {
				System.out.println("password created successfully");
			}
			else {
				System.out.println("Wrong confirm password entered");
			}
		}
		else {
			System.out.println("Again enter the password");
		}
	}

}
