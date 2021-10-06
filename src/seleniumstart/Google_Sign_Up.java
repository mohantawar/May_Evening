package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Sign_Up implements Common_Features_Relative_Path {

	static WebDriver driver;
	@Override
	public void firefox_launch() throws InterruptedException {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create an account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Mohan");
		driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("Tawar");
		driver.findElement(By.xpath("//div[(text()='Username')]")).sendKeys("mrtawar95");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Mohan@2830");
		driver.findElement(By.xpath("//input[contains(@name,'ConfirmPasswd')]")).sendKeys("Mohan@2830");
		driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
	}

	@Override
	public void chrome_launch() throws InterruptedException {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create an account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Mohan");
		driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("Tawar");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[(text()='Username')]")).sendKeys("mrtawar95");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Mohan@2830");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name,'ConfirmPasswd')]")).sendKeys("Mohan@2830");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
	}

}
