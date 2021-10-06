package new_package;

public class Constructor_Assignment {
float p;
	
	//declare
	public Constructor_Assignment(long h,String s) {
	p=600;
	System.out.println("Value"+p);
	}
	public Constructor_Assignment(boolean c, String t) {
		p= 20;
		System.out.println(p+ "which name is correct");
	}
	public Constructor_Assignment(int d , String l) {
		p=2;
		System.out.println( p +"Needs to put this value" );
		}
	public static void main(String []args) {
		new Constructor_Assignment(1000000000000l,"mm"); // value600.0
		new  Constructor_Assignment(true,"system"); //
		new Constructor_Assignment(100,"vaat");
	}
}
