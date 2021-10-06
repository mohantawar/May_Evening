package seleniumstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation_Methods extends CommonFeatures {
  
	static WebDriver driver;
	
	public void chrome_launch() {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
	}

	
	public void firefox_launch() {
		System.setProperty(Firefox_key, Firefox_value);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url1);
	}

}
