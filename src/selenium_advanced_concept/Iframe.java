package selenium_advanced_concept;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe implements CommonProperties{

	static WebDriver driver;
	public void chrome_launch() throws InterruptedException, IOException {
		
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.navigate().to(url4);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(text(),'Frames')])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(text(),'iFrame')]")).click();
		//WebElement iframe = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
		driver.switchTo().frame( "globalSqa");
		js.executeScript("scroll(0,1000)");
		driver.findElement(By.xpath("(//div[@class='info_desc']//h3)[5]")).click();
	}

}
