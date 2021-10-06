package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login_RelativePath {
  
	public static void main(String[]args) throws InterruptedException {
	   
		System.setProperty("webdriver.chrome.driver","E:\\Setup\\ChromeDriver92_SeleniumFile\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("8888680964");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Ganesh@143");
		driver.findElement(By.xpath("(//button)")).click();
   }
}
