package selenium_advanced_concept;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUps implements CommonProperties {
       
	static WebDriver driver;
	@Override
	public void chrome_launch() throws InterruptedException, IOException {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		
	}
	
	public void alert_pop_accept() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id = 'alertButton']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
    
	public void pop_up_alert_wait() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		
	}
	public void pop_up_alert_dismiss() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
	}
	public void pop_up_alert_accept() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
	public void pop_up_alert_prompt_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(3000);
	driver.switchTo().alert().sendKeys("Mohan");
	driver.switchTo().alert().accept();
	}
}
