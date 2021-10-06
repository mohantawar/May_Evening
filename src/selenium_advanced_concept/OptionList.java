package selenium_advanced_concept;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionList implements  CommonProperties{

	 static WebDriver driver;
	public void chrome_launch() throws InterruptedException, IOException {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url1);
	    Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role = 'button'])[2]")).click();
		Thread.sleep(3000);
	    WebElement birth_day=	driver.findElement(By.xpath("//select[@id='day']"));
	    Select select_day = new Select(birth_day);
	    List<WebElement>day_list= select_day.getOptions();
	    int size = day_list.size();
	    System.out.println(size);
	    for(int i=0;i<size;i++) {
	    	 String ele = day_list.get(i).getText();
	    	 System.out.println(ele); 
	    }
		
	}

}
