package selenium_advanced_concept;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait implements CommonProperties {
    
	static WebDriver driver;
	@Override
	public void chrome_launch() throws InterruptedException, IOException {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.udemy.com/");
		WebDriverWait w = new WebDriverWait(driver,10);
		WebElement link;
//		link = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt = 'Udemy'])[1]")));
		link = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt = 'Udemy'])[1]")));
		link.click();
		Thread.sleep(3000);
		
	}

}
