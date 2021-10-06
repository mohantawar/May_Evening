package seleniumstart;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;


public class Facebook_Login implements Facebook {

	static WebDriver driver;
	public static void takesnapshot(WebDriver d ,String FilePath) throws IOException {
		
		File soucrce = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File Destination = new File(FilePath);
		FileHandler.copy(soucrce, Destination);
	}
	
	
	public void chrome_launch() throws InterruptedException, IOException {
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		takesnapshot(driver,"D:\\selenium_Screenshot\\facebook11.png");
	  
	   WebElement un = driver.findElement(By.id("email"));
	  un.sendKeys("9623760138");
	  WebElement password = driver.findElement(By.id("pass"));
	  password.sendKeys("bhagwan");
	   driver.findElement(By.tagName("button")).click();
	  
	   
		}

	public void firefox_launch() {
		System.setProperty(Firefox_key, Firefox_value);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		WebElement un = driver.findElement(By.name("email"));
		un.sendKeys("9623760138");
		WebElement  pw = driver.findElement(By.name("pass"));
		pw.sendKeys("bhagwan");
		driver.findElement(By.name("login")).submit();
		
		
		}


	
	public void opera_launch() throws InterruptedException {
		System.setProperty(Opera_key, Opera_value);
		driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("9623760138");
		WebElement pw = driver.findElement(By.name("pass"));
		pw.sendKeys("bhagwan");
		driver.findElement(By.tagName("button")).submit();
		Thread.sleep(3000);
		
	}
	
	

}
