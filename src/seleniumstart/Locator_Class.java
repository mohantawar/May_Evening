package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Locator_Class implements Facebook{
    static WebDriver driver;
	
	public void chrome_launch() {
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		WebElement un = driver.findElement(By.className("inputtext _55r1 _6luy"));
		un.sendKeys("9623760138");
		WebElement pw = driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
		pw.sendKeys("bhagwan");
		driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		// driver.findElement(By.linkText("")).click();
		
	}

	
	public void firefox_launch() {
		System.setProperty(Firefox_key, Firefox_value);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	//WebElement un = driver.findElement(By.xpath());
//		un.sendKeys("9623760138");
//		WebElement pw = driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
//		pw.sendKeys("bhagwan");
//		driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
//		
		// driver.findElement(By.partialLinkText(" Sign u")).click();
			
		
		
		
	}

	
	public void opera_launch() {
		
		System.setProperty(Opera_key, Opera_value);
		driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
//		WebElement un = driver.findElement(By.className("inputtext _55r1 _6luy"));
//		un.sendKeys("9623760138");
//		WebElement pw = driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
//		pw.sendKeys("bhagwan");
//		driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		
	//	 driver.findElement(By.linkText(" Sign up")).click();
		
	}

}
