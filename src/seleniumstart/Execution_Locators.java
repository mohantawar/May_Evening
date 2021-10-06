package seleniumstart;

public class Execution_Locators extends Locator_Class{
	public static void main(String[]args) throws InterruptedException {
		
		 Execution_Locators obj = new  Execution_Locators();
	 obj.chrome_launch();
		// Thread.sleep(5000);
		// driver.close();
		 obj.firefox_launch();
		// Thread.sleep(5000);
	//	 driver.close();
		 obj.opera_launch();
	//	 Thread.sleep(5000);
	//	 driver.close();
	}

}
