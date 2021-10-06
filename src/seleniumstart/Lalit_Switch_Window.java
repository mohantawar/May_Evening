package seleniumstart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lalit_Switch_Window {
	public static void main(String[] args) throws InterruptedException {
		
		String chrome="E:\\Setup\\ChromeDriver92_SeleniumFile\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver",chrome);
		 WebDriver driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com/");
		
		String p = driver.getWindowHandle();
		Set<String> sc= driver.getWindowHandles();
		System.out.println(sc);
		for(String child :sc) {
			if(!p.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.close();
			}
		}
		
		driver.switchTo().window(p);
		driver.findElement(By.xpath("//a[@title='Jobseeker Login']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("Lalit");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Lalit");
		
	/*	Set<String> logid = driver.getWindowHandles();
		System.out.println(logid);
		for(String child1 :logid) {
			if(!p.equalsIgnoreCase(child1)) {
				driver.switchTo().window(child1);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("Lalit");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Lalit");
			}
		}*/

	}
}
