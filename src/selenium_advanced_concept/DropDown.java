package selenium_advanced_concept;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DropDown implements CommonProperties{

	static WebDriver driver;
	
public static void takesnapshot(WebDriver d ,String FilePath) throws IOException {
		
		File soucrce = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File Destination = new File(FilePath);
		FileHandler.copy(soucrce, Destination);
	}	
	public void chrome_launch() throws InterruptedException, IOException {
		
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role = 'button'])[2]")).click();
		Thread.sleep(3000);
	    WebElement day =	driver.findElement(By.xpath("//select[@id= 'day']"));
	    Select select = new Select(day);
	    select.selectByVisibleText("16");
	    Thread.sleep(2000);
	    WebElement month = driver.findElement(By.xpath("//select[@id= 'month']"));
	    Select Month = new Select(month);
	    Month.selectByIndex(5);
	    Thread.sleep(5000);
	    takesnapshot(driver,"D:\\selenium_Screenshot\\month_june112.png");
	  //  Month.selectByVisibleText("Jun");
	    Thread.sleep(4000);
	    WebElement year = driver.findElement(By.xpath("//select[@id= 'year']"));
	    Select Year = new Select(year);
	    Year.selectByValue("1995");
	    Thread.sleep(3000);
	}

}
