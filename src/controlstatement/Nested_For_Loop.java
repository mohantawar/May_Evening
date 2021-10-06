package controlstatement;

public class Nested_For_Loop {
	
	public void star_pattern1() {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
	
	public void star_patter2() {
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public void star_pattern3() {
		
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	
	public void star_pattrn4() {
		
		int i,j;
		for(i=1;i<=5;i++) 
	{
		for(j=4;j>=i;j--)
		{
				System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
			System.out.println();
	}
		
	}
	
	public void star_pattern5() {
        for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
        for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
        
	}
	
	public void star_pattern6() {
        for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
        for(int i=5;i>=1;i--) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
        
	}

	public void star_patter11() {
		for(int i =1;i<=5;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
public void star_pattrn7() {
		
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=4;j>=i;j--) {
				System.out.print(" ");
			}
		for(int k=1;k<=i;k++) {
			System.out.print(" *");
		}
			System.out.println();
		}
		
	}


	
	
	public static void main(String[]args) {
		Nested_For_Loop v = new Nested_For_Loop();
		v.star_pattern1();
		System.out.println("------------------------------------------");
		v.star_patter2();
		System.out.println("------------------------------------------");
		v.star_pattern3();
	    System.out.println("------------------------------------------");
	    v.star_pattrn4();
	    System.out.println("------------------------------------------");
	    v.star_pattern5();
	    System.out.println("------------------------------------------");
	    v.star_pattern6();
	    System.out.println("------------------------------------------");
	    v.star_patter11();
	    System.out.println("------------------------------------------");
	   v.star_pattrn7();
	  
	}
}
