package new_package;

public class Constructor_Ganesh_Kelker {
	
	// declaration
	int a ; //instance variable
	String name ;
	String surname;
	// constructor is used initiliase value of data member;
	

	
	// initilization
	// zero argument or non argument constructor
	public Constructor_Ganesh_Kelker( ) {
		a =10;
		name = "Mohan";
		System.out.println(a+name);
	}
	// first parameteised constructor in which we are passing two string argument
	public Constructor_Ganesh_Kelker(String s,String b) {
		
		name =s;
		surname = b;
		System.out.println(name + " "+ surname);
	}
	public Constructor_Ganesh_Kelker(int b,String s,int c) {
		
		// argument = parameter = datatype variable name
		a =b +c;
		System.out.println("new value of a "+ a);
	}
	public Constructor_Ganesh_Kelker(int c ,int b) {
		a = c+b;
		System.out.println("a =" + a);
	}
	
	
	// usage 
	public static void main(String[]args) 
	{
		
		//Constructor_Ganesh_Kelker b = new Constructor_Ganesh_Kelker();
		new Constructor_Ganesh_Kelker();
		new Constructor_Ganesh_Kelker("Savan ","Tawar"); // Savan Tawar
		new Constructor_Ganesh_Kelker(100,"Savan",100);
		new Constructor_Ganesh_Kelker(10,5);
		
	}

	
}
