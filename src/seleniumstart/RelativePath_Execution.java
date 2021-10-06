package seleniumstart;

public class RelativePath_Execution extends RelativePathLocator{
	public static void main(String[]args) throws InterruptedException {
		
		RelativePath_Execution obj = new RelativePath_Execution();
		obj.chrome_launch();
		Thread.sleep(6000);
		driver.close();
		obj.firefox_launch();
		Thread.sleep(5000);
		driver.close();
	}
	

}
