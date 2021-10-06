package new_package;

public class Data_type {
	public static void example() {
		char c = 'f';
		
		short d_min = -32768;
		short d_max = 32767;
		int i_min = -2147483648;
		int i_max = 2147483647;
		boolean b = false;
		boolean b_true = true;
		byte t_min = -128;
		byte t_max = 127;
		long l_max = 2147483648l;
		float f = 3.142f;
		float f_max = 123674985890190f;
		double d = 21474836489034053758d;
		System.out.println("Data_type are as follows");
		System.out.println(c + "\n"+d_min +"\n"+d_max+"\n"+i_min+"\n"+i_max+"\n"+b+"\n"+b_true);
		System.out.println(t_min+"\n"+t_max+"\n"+l_max+"\n"+ f+"\n"+f_max+"\n"+d);
		
	}
public static void main(String []args) {
	example();
	
}
}
