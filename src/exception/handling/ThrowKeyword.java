package exception.handling;

public class ThrowKeyword {
 
	
//	public static void main(String[] args) throws Exception {
//	
//	  throw new Exception("My own Exception");
//}
	public static void main(String[] args) {
		
		try{
			throw new Exception("Customized Exception");
		}
		catch(Exception e) {
			
		}
		System.out.println("Hello Exception");
	}
}
