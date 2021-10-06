package selenium_advanced_concept;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class DragAndDrop implements CommonProperties {

	static WebDriver driver;
	public void chrome_launch() throws InterruptedException, IOException {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url4);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'DragAndDrop')]")).click();
		Thread.sleep(3000);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class = 'demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		Thread.sleep(5000);
	WebElement ele1= driver.findElement(By.xpath("//img[@alt ='The peaks of High Tatras']"));
	WebElement ele2 = driver.findElement(By.xpath("//img[@alt = 'The chalet at the Green mountain lake']"));
	WebElement ele3 = driver.findElement(By.xpath("//img[@alt = 'Planning the ascent']"));
	WebElement ele4 = driver.findElement(By.xpath("//img[@alt = 'On top of Kozi kopka']"));
	WebElement ele5 = driver.findElement(By.xpath("//div[@id = 'trash']"));
	Actions a = new Actions(driver);
//	a.clickAndHold(ele1).moveToElement(ele5).release().build().perform();
//	a.clickAndHold(ele2).moveToElement(ele5).release().build().perform();
//	a.clickAndHold(ele3).moveToElement(ele5).release().build().perform();
	//a.clickAndHold(ele4).moveToElement(ele5).release().build().perform();
	a.dragAndDrop(ele4, ele5).perform();
	a.dragAndDrop(ele3, ele5).perform();
	a.dragAndDrop(ele2, ele5).perform();
	a.dragAndDrop(ele1, ele5).perform();
	driver.switchTo().defaultContent();
	WebElement search = driver.findElement(By.xpath("//input[@name = 's']"));
	Thread.sleep(3000);
	a.sendKeys(search, "Android studio").perform();
	Thread.sleep(5000);
	WebElement Home = driver.findElement(By.xpath("(//a[contains(text(),'Home')])[1]"));
	a.contextClick(Home).perform();
	a.doubleClick(Home).perform();
	
	}

}
