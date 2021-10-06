package seleniumstart;

public class Execution_Common_Thing extends Implementation_of_Common_Things{

	public static void main(String[]args) throws InterruptedException {
		Execution_Common_Thing obj = new Execution_Common_Thing();
		obj.chrome_launch();
		Thread.sleep(5000);
		
		driver.close();
	}
}
