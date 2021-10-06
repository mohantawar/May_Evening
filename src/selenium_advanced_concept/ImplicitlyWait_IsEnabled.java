package selenium_advanced_concept;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait_IsEnabled implements CommonProperties{

	static WebDriver driver;
	
	public void chrome_launch() throws InterruptedException, IOException {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
//	  WebElement search_box = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//	  boolean enabled=  search_box.isEnabled();
//  	System.out.println(enabled);
//	if(enabled == true) {
//		System.out.println("Test scenario passed");
//	}
//	else {
//		System.out.println("Test scenario failde");
//	}
//	driver.quit();
	
	  WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	 boolean is_displayed =  logo.isDisplayed();
	 if(is_displayed == true) {
		 System.out.println("Test case Passed");
	 }
	 else {
		 System.out.println("Test case Failed");
	 }
		driver.quit();
	}
    
}
