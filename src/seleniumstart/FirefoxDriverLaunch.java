package seleniumstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverLaunch {
public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "E:\\Setup\\FirefoxDriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	
	WebDriver d = new FirefoxDriver();
	d.manage().window().maximize();
	d.get("https://www.phonepe.com/");
	Thread.sleep(3000);
	d.close();
}
}
