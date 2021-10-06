package seleniumstart;

public class Execution_of_window extends MultipleWindow{
	
	public static void main(String[]args) throws InterruptedException {
		Execution_of_window obj = new Execution_of_window();
		obj.chrome_launch();
		Thread.sleep(3000);
		driver.quit();
		
//		obj.firefox_launch();
//		Thread.sleep(2000);
//		driver.quit();
		
	}

}
