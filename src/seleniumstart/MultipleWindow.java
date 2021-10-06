package seleniumstart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow extends CommonFeatures{

	static WebDriver driver;
	
	public void firefox_launch() throws InterruptedException {
		System.setProperty(Firefox_key, Firefox_value);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		driver.get(url3);
		String parent_window = driver.getWindowHandle();
	//	System.out.println(parent_window);
		Set<String>parent_child_windows = driver.getWindowHandles();
		int count = parent_child_windows.size();
	//	System.out.println(parent_child_windows);
		for(String child:parent_child_windows) {
			if(!parent_window.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("child window title is: "+ driver.getTitle());
				Thread.sleep(1000);
				driver.close();
			}
				
		}
	}
	

	
	public void chrome_launch() throws InterruptedException {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		driver.navigate().to(url3);
		String parent_window = driver.getWindowHandle();
	//	System.out.println(parent_window);
		Set<String>parent_child_windows = driver.getWindowHandles();
	
		int count = parent_child_windows.size();
	//	System.out.println(count);
	//	System.out.println(parent_child_windows);
		for(String child_id:parent_child_windows) {
			if(!parent_window.equalsIgnoreCase(child_id)) {
				driver.switchTo().window(child_id);
				System.out.println("child window title is: "+ driver.getTitle());
				Thread.sleep(3000);
				driver.close();
			}
				
		}
	 Thread.sleep(3000);
     	driver.switchTo().window(parent_window);
	//	driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@placeholder ='Skills, Designations, Companies']")).sendKeys("cognizant");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='qsb-location-sugg']")).sendKeys("Pune");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		Thread.sleep(3000);
		
	}

}
