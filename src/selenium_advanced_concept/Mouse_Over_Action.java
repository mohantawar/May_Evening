package selenium_advanced_concept;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over_Action implements CommonProperties  {

	 static WebDriver driver;
	 
	@Override
	public void chrome_launch() throws InterruptedException, IOException {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url5);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Automation Tools')]"));
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		Thread.sleep(1000);
		                 
		List<WebElement>webelements_list= driver.findElements(By.xpath("//div[@class = 'dropdown-content']/a"));
		int size = webelements_list.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			     WebElement f = webelements_list.get(i);
			     String p = f.getAttribute("innerHTML");
			     System.out.println(p);
			     if(p.equalsIgnoreCase("TestNG")) {
			    	 f.click();
			    	 break;
			    	 }
			     
			    
			     
               }
		}
		
	}



