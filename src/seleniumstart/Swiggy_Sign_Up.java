package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swiggy_Sign_Up extends CommonFeatures{

	static WebDriver driver;
	@Override
	public void firefox_launch() throws InterruptedException {
		System.setProperty(Firefox_key, Firefox_value);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8380848615");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ashu ");
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("ashu@123");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("ashu123");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	}

	@Override
	public void chrome_launch() throws InterruptedException {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8380848615");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ashu ");
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("ashu@123");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("ashu123");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
	}

}
