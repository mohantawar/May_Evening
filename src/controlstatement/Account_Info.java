package controlstatement;

import java.util.Scanner;

public class Account_Info {

	public void user_name(String s) {
		
		if(s=="mohan2830") {
		
		System.out.println("You enter correct username");

		}
		System.out.println("you have entered username "+ s);
	}
	public void password(String pwd) {
		if(pwd == "Mohan@1234") {
			System.out.println("you entered correct username");
		}
		else {
			System.out.println("you entered wrong password");
		}
		
		}
	
	  public static void main(String[]args) {
		  
		  Scanner sc = new Scanner(System.in);
		  Account_Info info = new Account_Info();
		  String username;
		  String password;
		  System.out.println("Please enter ur username");
		  username = sc.nextLine();
		  info.user_name(username);
		 // System.out.println("Please enter ur password");
		 // password = sc.nextLine();
		  //info.password(password);
		  //sc.close();
		  
	  }
	}

