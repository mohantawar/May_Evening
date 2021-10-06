package practise;

import java.util.Scanner;

public class Practise_Problem {

	public void factorial(int n) {
	  long fact =1;
	  
	  while(n>0) {
		  fact=fact*n;
		  n--;// 4 3 2
	  }
	  System.out.println(fact);
	}
	
	public void sum_of_no(int n) {
		
		int sum =0; // 1234
		int rem;
		while(n>0) {
			rem = n%10;
			sum = sum+rem;
			n = n/10;
		}
		System.out.println("sum of no is = "+sum);	
	}
	public void reverse_no(int n) {
		int sum =0;
		int rem ;
		while(n>0)
		{
			
			rem = n%10;
			sum = sum*10+rem;
			n = n/10;
		}
		System.out.println(sum);
	}
	
	
	public void palindrome(int n) {
		int sum =0;
		int rem ;
		int original = n; // 1221
		while(n>0) {
			rem = n%10;
			sum = sum*10+rem;
			n = n/10;
		}
		
		if(original==sum) {
			System.out.println("no is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
	public void fibonaci_series() {
		int next1 =0;
		int previous =0; // 0,1,1,2,3,5,8,13 21,34......
		int next =1;
		System.out.print(previous+" "+next);
		for(int i =2;i<=10;i++) {
			next1 = previous + next;
			System.out.print(" "+next1);
			previous = next;
			next = next1;
		}
		
	}
	public void prime_no(int n) {
		
		for(int i=100;i<=n;i++) {
			int flag =0;
			for(int j =2;j<=i-1;j++) {
				if(i%j==0) {
					flag = flag+1;
					
				}
			}
			if(flag==0) {
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
			System.out.println(prime_no +" is not a prime no");
		}
		else {
			System.out.println(prime_no+"  is a prime no");
		}
	}
	
  	
	
	public static void main(String[]args) {
		Practise_Problem p = new Practise_Problem();
		p.factorial(7);
		p.sum_of_no(1111);
		p.reverse_no(1234);
		p.palindrome(1234);
		p.fibonaci_series();
		System.out.println();
		p.prime_no(200);
		p.is_prime();
	}
}
