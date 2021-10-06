package seleniumstart;

public class Execution_Swiggy extends Swiggy_Sign_Up {
	
	public static void main(String[]args) throws InterruptedException {
		
		Execution_Swiggy obj = new Execution_Swiggy();
		obj.chrome_launch();
		Thread.sleep(8000);
		driver.close();
		obj.firefox_launch();
		Thread.sleep(5000);
		driver.close();
		
	}

}
