package exception.handling;

public class Finalize {
	public void finalize() {
		System.out.println("finalize method");
	}
	
	public  static void main(String[]args) {
		
		Finalize f1 = new Finalize();
		Finalize f2 = new Finalize();
		f1 = null;
		f2 = null;
		System.gc();
	}

}
