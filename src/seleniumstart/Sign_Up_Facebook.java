package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sign_Up_Facebook extends  CommonFeatures {

	static WebDriver driver;
	public void firefox_launch() throws InterruptedException {
		
		System.setProperty(Firefox_key, Firefox_value);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a)[5]")).click();
		Thread.sleep(3000);
		WebElement First_Name =	driver.findElement(By.xpath("(//input)[9]"));
		
		First_Name.sendKeys("Mohan");
		WebElement Surname = driver.findElement(By.xpath("(//input)[10]"));
		
		Surname.sendKeys("Tawar");
		WebElement mobile_no = driver.findElement(By.xpath("(//input)[11]"));
		
		mobile_no.sendKeys("9623970138");
		WebElement New_Password = driver.findElement(By.xpath("(//input)[13]"));
		
		New_Password.sendKeys("Mohan@2830");
		WebElement Day = driver.findElement(By.xpath("(//select)[1]"));
		
		Day.sendKeys("16");
		WebElement Month = driver.findElement(By.xpath("(//select)[2]"));
		
		Month.sendKeys("6");
		WebElement Year = driver.findElement(By.xpath("(//select)[3]"));
		
		Year.sendKeys("1995");
		WebElement Male = driver.findElement(By.xpath("(//input)[17]"));
		
		Male.click();
		WebElement Sign_Up = driver.findElement(By.xpath("(//button)[2]"));
		
		Sign_Up.click();
		
	}

	
	public void chrome_launch() throws InterruptedException {

		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a)[5]")).click();
		Thread.sleep(3000);
		WebElement First_Name =	driver.findElement(By.xpath("(//input)[9]"));
		
		First_Name.sendKeys("Mohan");
		WebElement Surname = driver.findElement(By.xpath("(//input)[10]"));
		
		Surname.sendKeys("Tawar");
		WebElement mobile_no = driver.findElement(By.xpath("(//input)[11]"));
		
		mobile_no.sendKeys("9623970138");
		WebElement New_Password = driver.findElement(By.xpath("(//input)[13]"));
		
		New_Password.sendKeys("Mohan@2830");
		WebElement Day = driver.findElement(By.xpath("(//select)[1]"));
		
		Day.sendKeys("16");
		WebElement Month = driver.findElement(By.xpath("(//select)[2]"));
		
		Month.sendKeys("6");
		WebElement Year = driver.findElement(By.xpath("(//select)[3]"));
		
		Year.sendKeys("1995");
		WebElement Male = driver.findElement(By.xpath("(//input)[17]"));
		
		Male.click();
		WebElement Sign_Up = driver.findElement(By.xpath("(//button)[2]"));
		
		Sign_Up.click();
		
		

		
	}

}
