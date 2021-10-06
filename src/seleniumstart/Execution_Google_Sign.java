package seleniumstart;

public class Execution_Google_Sign extends Google_Sign_Up{

	public static void main(String[]args) throws InterruptedException {
		
		Execution_Google_Sign obj = new Execution_Google_Sign();
		obj.chrome_launch();
		Thread.sleep(5000);
		driver.close();
		obj.firefox_launch();
		Thread.sleep(5000);
		driver.close();
		
	}
}
