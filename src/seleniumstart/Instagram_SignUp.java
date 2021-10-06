package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Instagram_SignUp extends CommonFeatures{
    
	static WebDriver driver;
	@Override
	public void firefox_launch() throws InterruptedException {
		
		System.setProperty(Firefox_key, Firefox_value);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		Thread.sleep(2000);
		WebElement Mobile_No =  driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		Thread.sleep(2000);
		Mobile_No.sendKeys("9527075468");
		WebElement Fullname = driver.findElement(By.xpath("//input[@name='fullName']"));
		Thread.sleep(2000);
		Fullname.sendKeys("Mohan Rameshrao Tawar");
		WebElement Username = driver.findElement(By.xpath("//input[@maxlength='30']"));
		Thread.sleep(2000);
		Username.sendKeys("mohan_tawar_2830");
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Thread.sleep(2000);
		Password.sendKeys("Mohan@8230");
		WebElement Sign_Up = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(2000);
		Sign_Up.click();
	}

	@Override
	public void chrome_launch() throws InterruptedException {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		Thread.sleep(2000);
		WebElement Mobile_No =  driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		Thread.sleep(2000);
		Mobile_No.sendKeys("9527075468");
		
		WebElement Fullname = driver.findElement(By.xpath("//input[@name='fullName']"));
		Thread.sleep(2000);
		Fullname.sendKeys("Mohan Rameshrao Tawar");
		WebElement Username = driver.findElement(By.xpath("//input[@maxlength='30']"));
		Thread.sleep(2000);
		Username.sendKeys("mohan_tawar_2830");
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Thread.sleep(2000);
		Password.sendKeys("Mohan@8230");
		WebElement Sign_Up = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(2000);
		Sign_Up.click();
		
			
	}

}
