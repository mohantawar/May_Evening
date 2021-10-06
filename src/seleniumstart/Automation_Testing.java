package seleniumstart;

public class Automation_Testing extends BrowserNavigationLaunch{
public static void main(String[]args) throws InterruptedException {
	
	
	BrowserNavigationLaunch browser = new BrowserNavigationLaunch();
	
	//driver.manage().window().maximize();
	browser.chromelaunch();
	
	driver.close();
	Thread.sleep(3000);
	browser.edgelaunch();
	driver.close();
	Thread.sleep(3000);
	browser.firefoxlaunch();
	driver.close();
	Thread.sleep(3000);
	browser.operalaunch();
	driver.close();
	Thread.sleep(3000);
	browser.internetexplorer();
	driver.quit();
	
}
}
