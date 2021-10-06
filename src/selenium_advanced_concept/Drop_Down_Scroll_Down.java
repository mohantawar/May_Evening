package selenium_advanced_concept;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop_Down_Scroll_Down implements CommonProperties{

	static WebDriver driver;
	public void chrome_launch() throws InterruptedException, IOException {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url2);
		Thread.sleep(5000);
	//	driver.switchTo().frame("google_esf");
	driver.findElement(By.xpath("//span[@class = 'chNavIcon appendBottom2 chSprite chHotels']")).click();
		
	}

}
