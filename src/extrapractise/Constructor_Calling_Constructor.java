package extrapractise;

public class Constructor_Calling_Constructor {
 
	public  Constructor_Calling_Constructor() {
		
		this(19,20);
	}
	public Constructor_Calling_Constructor(int a,int b) {
		System.out.println(a+b);
	}
}
