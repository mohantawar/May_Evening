package new_package;

public class Constructor_Practise {
	int a ;
	public  Constructor_Practise()
	{
		a = 10;
		System.out.println("First constructor value intiliazation is:"+" "+ a );
	}
	
	public  Constructor_Practise(int k)
	{
		a =20;
		System.out.println("Value of a and k are " + a + " "+k);
	}
	public Constructor_Practise(String k)
	{
		a = 30;
		System.out.println("Value of a and k are "+a+" "+k);
	}
	public Constructor_Practise(long d)
	{
		a = 40;
		System.out.println("value of a and d are "+ a + " "+ d);
	}
	public Constructor_Practise(String s,int k) {
		a = 50;
		System.out.println(a);
		System.out.println("Value of string and int is  "+ s +" "+ k);
	}
	public Constructor_Practise(double d,String s ,int k) {
		a = 100;
		System.out.println(a);
		System.out.println("double = "+d+" "+"String: "+s+" "+"int"+k);
		
	}
	public Constructor_Practise(int k,int s) {
		a = 200;
		System.out.println(a);
		System.out.println("value of s and k are "+ s + " "+ k);
	}
	public static void main(String[]args) 
	{
		
		new Constructor_Practise();
		new Constructor_Practise(1000000000);
		new Constructor_Practise("Mohan");
		new Constructor_Practise(1000000000000000000l);
		new Constructor_Practise(120);
		new Constructor_Practise(123456789);
		new Constructor_Practise("Savan",100);
		new Constructor_Practise(12345678901234d,"Pawan",12345678);
		new Constructor_Practise(123456789,32000);
	}

}
