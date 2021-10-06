package selenium_advanced_concept;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait_Is_Selected implements CommonProperties {

	static WebDriver driver;
	@Override
	public void chrome_launch() throws InterruptedException, IOException {
		
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url6);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text() = 'Prepaid/Postpaid']")).click();
	// WebElement postpaid = driver.findElement(By.xpath("//input[@id= 'radio1']"));
	//  boolean result= postpaid.isSelected();
	//  System.out.println(result);
		WebElement prepaid = driver.findElement(By.xpath("//input[@id= 'radio0']"));
		boolean result = prepaid.isSelected();
	  if(result == true) {
		  System.out.println("Test scenario passed for is selected method.");
	  }
	  else {
		  System.out.println("Test scenario failed");
	  }
	}

}
