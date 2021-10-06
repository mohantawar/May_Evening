package seleniumstart;

public class Main_Basic_Methods extends Concrete_BasicMethods {
	
	public static void main(String[]args) throws InterruptedException {
		
		
		Main_Basic_Methods obj = new Main_Basic_Methods();
		obj.chrome_launch();
		
		Thread.sleep(3000);
		driver.navigate().to(url1);
    	Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.quit();
		
		
	}
}
