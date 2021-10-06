package selenium_advanced_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor implements CommonProperties {

	static WebDriver driver;
	public void chrome_launch() throws InterruptedException {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		Thread.sleep(3000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
	    js.executeScript("scroll(0,2300)");
	    Thread.sleep(3000);
	    js.executeScript("scroll(0,-2000)");
	    Thread.sleep(3000);
	    driver.switchTo().frame("a077aa5e");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//img[@src = 'Jmeter720.png']")).click();
	    Thread.sleep(5000);
	    
	 	
	 
		
	}

}
