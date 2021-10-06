package new_package;

public class Argument_NonArgument {
	// declaration
	String name;
	int id;
	int age;
	String dob;
	public Argument_NonArgument() {
		// Zero argument or non argument constructor
		System.out.println("Non argument constructor");
		name = "Mohan Rameshrao Tawar";
		 id = 121;
		 age = 26;
		 dob = "16/06/1995";
		 System.out.println(name + " "+ id+" "+age +" "+dob);
	}
	public Argument_NonArgument(String name1,int id1,int age1,String dob1) {
		System.out.println("Argument Constructor");
		name = name1;
		id = id1;
		age = age1;
		dob = dob1;
		System.out.println(name + " "+ id+" "+age +" "+dob);
	}
	public static void main(String []args) {
		new Argument_NonArgument();
		new Argument_NonArgument("Pawan",1,29,"1/1/1991");
		new Argument_NonArgument("Savan",2,28,"1/1/1993");
		new Argument_NonArgument("Bhagwan",2,25,"1/1/1996");
	}

}
