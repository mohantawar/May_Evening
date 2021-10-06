package seleniumstart;

public class Main_Execution_Abstract_Techniques extends Navigation_Methods {

	public static void main(String[]args) throws InterruptedException {
		Navigation_Methods obj = new Navigation_Methods();
		obj.chrome_launch();
		Thread.sleep(3000);
		driver.close();
		obj.firefox_launch();
		Thread.sleep(3000);
		driver.close();
		
	}
}
