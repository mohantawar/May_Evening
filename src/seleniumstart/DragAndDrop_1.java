package seleniumstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_1 {
	static WebDriver driver;
	public static void main(String[]args) throws InterruptedException {
		String Chorme_key = "webdriver.chrome.driver";
		String Chrome_value = "E:\\Setup\\ChromeDriver92_SeleniumFile\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		WebElement e1= driver.findElement(By.xpath("//span[text()='Draggable 2']"));
		WebElement e2 = driver.findElement(By.xpath("//span[text()='Draggable 3']"));
		WebElement e3 = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions a = new Actions(driver);
		//a.clickAndHold(e1).moveToElement(e3).release().build().perform();
		a.dragAndDrop(e2, e3).perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
