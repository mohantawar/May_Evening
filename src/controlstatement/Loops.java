package controlstatement;

import java.util.Scanner;
public class Loops {

  public void sum() {
		
	  int i;
		int sum =0;
		for(i=0;i<=10;i++) {
			sum = sum +i;
		}
		System.out.println("sum of numbers upto 10 is = "+sum);
	}
	
	public void even_no() {
		
		int i;
		for(i=1;i<=10;i++) {
			if(i%2==0) {
			System.out.println(i);
			}
		}
	}
	
	public void is_prime() {
		int prime_no; // declaration
		int flag =0;  //  indicator 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no ");
		prime_no = sc.nextInt(); // 
		sc.close();
		for(int i =2;i<=prime_no-1;i++) {
			if(prime_no%i==0) {
				flag = flag+1;
			}
		}
		if(flag>0) {
			System.out.println(prime_no +"is not a prime no");
		}
		else {
			System.out.println(prime_no+" is a prime no");
		}
	}
	
	public static  void prime_no() {
		int no ;
		int j;
		int temp = 0;
		for(no=1;no<=100;no++) {
			
			for(j=2;j<=no-1;j++) 
			{
				if(no%j==0)
				{
					temp = temp+1;
				}
			}
		}
		if(temp==0) {
			System.out.println(no);
		}
		else {
			temp = 0;
		}
	}
	
	public static void main(String[]args) {
		Loops l = new Loops();
		l.sum();
		System.out.println("Even no between 1 to 10 are");
		l.even_no();
		l.is_prime();
		prime_no();
		
	}
	
}


