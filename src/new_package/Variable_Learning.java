package new_package;

public class Variable_Learning {
	public void demo() {
		String name = "Mohan"; // here name is variable
		int no = 2830;
		System.out.println(name + "\n"+no);
	}
	public static void variable() {
		String address = "Nanded";
		System.out.println(address);
	}
	public static void main(String[]args) {
		Variable_Learning v = new Variable_Learning();
		v.demo();
		variable();
	}

}
