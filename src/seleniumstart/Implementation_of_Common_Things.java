package seleniumstart;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implementation_of_Common_Things implements CommonThings {

	 static WebDriver driver;
	
	 public void chrome_launch() throws InterruptedException {
		
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// to delete all cookies and cache before launching browser
		
		driver.manage().deleteAllCookies(); 
	
		// we use Dimension class from selenium to resize shape of window where we are launching url
		// Dimension is parametrized constructor i.e Dimension(int,int)
		// we need to pass argument in Dimension constructor
		driver.get(url);
	
		Dimension dimension = new Dimension(500, 500);
		
		driver.manage().window().setSize(dimension);
		
		
		 Point p = new Point(500, 500);
	
		driver.manage().window().setPosition(p);
	    Thread.sleep(5000);
		
	//	driver.get(url1);
		
		
	}

}
