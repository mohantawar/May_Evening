
public class Hello {
	  
	// int ,char ,short ,long ,double,float,boolean,byte;
	// String,array,class
	public void data_types() {
		byte b = -128 ;// size 1 byte 
		short c = -32768;// size is 2 byte
		int i = 1000000000;
		long v = 100000000000000l;
		char s = 'S';
		boolean f = true;
		float u = 120.29f;
		double d = 12930959404058d;
		System.out.println(b +"\n"+ c+"\n"+i+"\n"+v+"\n"+s+"\n"+f+"\n"+u+"\n"+d);
		System.out.println(b + c+i+v+"\n"+s+"\n"+f+"\n"+u+"\n"+d);
		
	}
	String name  = "mohan";
	byte b = -128;
	public void general() 
	{
		System.out.println("hello michchekl");
	}
  public static void sidhbapu() {
	  System.out.println("jony sins");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("hello mohan"); 
    
    Hello b = new Hello();// syntax : class_name objname(user defined) = new class_name()
    b.general();
    b.data_types();
    sidhbapu();
    
	}

}
