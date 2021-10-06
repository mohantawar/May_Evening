package controlstatement;

import java.util.Scanner;

public class User_Input {
	
	String full_name;
	public void personal_info() {
		
		Scanner sc = new Scanner(System.in);
		
		String full_name; // local variable 
		String Address;
		int age;
		String blood_grp;
		
		System.out.println("Please enter your fullname:");
		full_name = sc.nextLine();
		System.out.println("Please enter your address");
		Address = sc.nextLine();
		System.out.println("please enter your blood group");
		blood_grp = sc.nextLine();
		System.out.println("Enter your age");
		age = sc.nextInt();	
		
		
		System.out.println("Your Personal Details:");
		System.out.println(full_name + "\n"+ Address+"\n"+age+"\n"+blood_grp);
	}
	public void education() {
		
		Scanner sc = new Scanner(System.in);
		float Hsc_Marks;
		float Ssc_Marks;
		float Degree_Marks;
		System.out.println("Please enter your Ssc_Marks");
		Hsc_Marks = sc.nextFloat();
		System.out.println("Please enter your Hsc_Marks");
	    Ssc_Marks = sc.nextFloat();
	    System.out.println("Please enter your Degree Marks");
	    Degree_Marks = sc.nextFloat();
	    
	    System.out.println("Your Education Details:"); 
	    System.out.println(Hsc_Marks + "\n"+ Ssc_Marks+"\n"+Degree_Marks);
	    
			
	}
	public void other_interest() {
		
		Scanner sc = new Scanner(System.in);
		String hobbies;
		String Skills;
		System.out.println("Please enter your hobbies");
		hobbies = sc.nextLine();
		System.out.println("Please enter your Skills");
		Skills = sc.nextLine();
		sc.close();
		System.out.println("Your Others Details:");
		System.out.println(hobbies+ "\n"+ Skills);
		
	}
	
	public static void main(String[]args) {
	
		User_Input obj = new User_Input(); // object creation 
		obj.personal_info();
		obj.education();
		obj.other_interest();
			
	}

}
