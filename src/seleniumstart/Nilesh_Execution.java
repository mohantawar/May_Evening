package seleniumstart;

public class Nilesh_Execution extends Nilesh_Launch_Chrome {
	
	public static void main(String[]args) throws InterruptedException {
		 Nilesh_Execution obj = new  Nilesh_Execution();
		 obj.chromeLaunch();
		 Thread.sleep(3000);
		 driver.close();
	}

}
