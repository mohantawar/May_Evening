package seleniumstart;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow_Link2 extends CommonFeatures{
   static WebDriver driver1;
	
	public void firefox_launch() throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

	
	public void chrome_launch() throws InterruptedException, IOException {
		System.setProperty(Chorme_key, Chrome_value);
		driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		takesnapshot(driver1,"D:\\selenium_Screenshot\\seleniumblog.png");
		driver1.findElement(By.xpath("(//a[@name = 'link1'])[3]")).click();
		takesnapshot(driver1,"D:\\selenium_Screenshot\\seleniumblogtab1.png");
		String parent1 = driver1.getWindowHandle();
       
         Set<String>Facebook_child = driver1.getWindowHandles();
        for(String child1:Facebook_child) {
        	
        	if(!parent1.equalsIgnoreCase(child1)) {
        		driver1.switchTo().window(child1);
        		takesnapshot(driver1,"D:\\selenium_Screenshot\\seleniumblogtab2.png");
        		Thread.sleep(3000);
        		driver1.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("youtube");
        		Thread.sleep(2000);
        		driver1.findElement(By.xpath("//input[@type='submit']")).click();
        		Thread.sleep(2000);
        		driver1.close();
        	}
        }
		driver1.switchTo().window(parent1);
		driver1.close();
	}
 
}
