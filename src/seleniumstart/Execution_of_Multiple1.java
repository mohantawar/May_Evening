package seleniumstart;

public class Execution_of_Multiple1 extends MultipleWindow1{
	public static void main(String[]args) throws InterruptedException {
		Execution_of_Multiple1 obj = new Execution_of_Multiple1();
		obj.chrome_launch();
		Thread.sleep(3000);
		driver.close();
//		obj.firefox_launch();
//		Thread.sleep(3000);
//		driver.close();
	}
}
