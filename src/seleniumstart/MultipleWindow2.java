package seleniumstart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow2 extends  CommonFeatures{

	static WebDriver driver;
	public void firefox_launch() throws InterruptedException {
		
		System.setProperty(Firefox_key, Firefox_value);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	
	public void chrome_launch() throws InterruptedException {
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.findElement(By.xpath("(//a[text()=' Click this link to start new Tab '])[1]")).click();
	
		String Parent_Window = driver.getWindowHandle(); // ParentWindow id
		 Set<String> Parent_Child_Window  = driver.getWindowHandles(); // parent plus child
		 int count = Parent_Child_Window.size();
		 System.out.println(Parent_Child_Window);
		 System.out.println(count);
		 System.out.println("**************************");
		
		 for(String e:Parent_Child_Window ) {
			 System.out.println(e);
		 }
		  
		
		 for(String child:Parent_Child_Window) {
			  if(!Parent_Window.equalsIgnoreCase(child)) {
				  driver.switchTo().window(child);
				  //System.out.println("Title of child window is :"+driver.getTitle());
				
				  Thread.sleep(3000);
				  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("youtube");
				  Thread.sleep(3000);
				  driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")).click();
				  driver.close();
			  }
			  
		  }
		
		driver.switchTo().window(Parent_Window);
		driver.findElement(By.xpath("(//a[@class='post-count-link'])[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@name = 'link1'])[2]")).click();
		Set<String>Facebook_child1 = driver.getWindowHandles();
		
		for(String child1:Facebook_child1) {
			if(!Parent_Window.equalsIgnoreCase(child1)) {
				
				driver.switchTo().window(child1);
				driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("9623760138");
				Thread.sleep(3000);
				
			}
			
			
		}
		
	}
	

}
