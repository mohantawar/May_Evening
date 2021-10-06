package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login implements Facebook{

	static WebDriver payal;
	@Override
	public void chromelaunch() {
		
		System.setProperty(chrome_key, chrome_value);
		payal = new ChromeDriver();
		payal.manage().window().maximize();
		payal.get(url1);
		payal.findElement(By.name("username")).sendKeys(un);
		
		payal.findElement(By.name("password")).sendKeys(pw);
		
		payal.findElement(By.tagName("button")).submit();
		
		
		
	}

}
