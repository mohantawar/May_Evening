package selenium_package;

public class Execution extends Implementation{
	
	public static void main(String[]args) throws InterruptedException {
		Execution b = new Execution();
		b.chrome_launch();
		Thread.sleep(3000);
		driver.close();
	}

}
