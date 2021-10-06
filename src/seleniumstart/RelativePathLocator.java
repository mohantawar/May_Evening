package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativePathLocator extends CommonFeatures {

	static WebDriver driver;
	
	public void firefox_launch() throws InterruptedException {
		System.setProperty(Firefox_key, Firefox_value);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url1);
		Thread.sleep(3000);
		
		// Relative path = //tagname[@attributename='attributevalue']
		
//		WebElement un = driver.findElement(By.xpath("//input[@type='text']"));
//		un.sendKeys("9623760138");
//		WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
//		pw.sendKeys("bhagwan");
//		driver.findElement(By.xpath("//button[@value='1']")).click();
//		Thread.sleep(3000);
		
		// Relative path = (//tagname)[index]
		
//		driver.findElement(By.xpath("(//input)[3]")).sendKeys("9623760138");
//		driver.findElement(By.xpath("(//input)[4]")).sendKeys("bhagwan");
//		driver.findElement(By.xpath("//button")).click();
//		Thread.sleep(3000);
		
		// Relative paht = //tagname[contains(@AttributeName,'AttributeValue')]
		
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address or phone number')]")).sendKeys("9623760138");
//		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("bhagwan");
//		driver.findElement(By.xpath("//button[contains(@value,'1')]")).click();
//		Thread.sleep(5000);
		
//		WebElement un = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//		un.submit();
		
		driver.findElement(By.xpath("//span[contains(text(),'Log in ')]")).click();
		Thread.sleep(3000);
		
		
	}

	
	public void chrome_launch() throws InterruptedException {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		// RelativePath = //tagname[@attributename='attributevalue']
		
//		WebElement un = driver.findElement(By.xpath("//input[@type='text']"));
//		un.sendKeys("9623760138");
//		WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
//		pw.sendKeys("bhagwan");
//		driver.findElement(By.xpath("//button[@value='1']")).click();
//		Thread.sleep(3000);
		
		
		
		// RelativePath = //tagname[text()='textvalue']
		//WebElement un = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	//	un.submit();
		
		// Relativepath = (//tagname)[index]
		
//		driver.findElement(By.xpath("(//input)[3]")).sendKeys("9623760138");
//		driver.findElement(By.xpath("(//input)[4]")).sendKeys("bhagwan");
//		driver.findElement(By.xpath("//button")).click();
//		Thread.sleep(3000);
		
		// RelativePath = //tagname[contains(@AttributeName,'AttributeValue')]
		
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address or phone number')]")).sendKeys("9623760138");
//		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("bhagwan");
//		driver.findElement(By.xpath("//button[contains(@value,'1')]")).click();
//		Thread.sleep(5000);
		
		
	}

}
