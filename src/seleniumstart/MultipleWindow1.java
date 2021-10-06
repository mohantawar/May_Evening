package seleniumstart;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow1 extends CommonFeatures {

	static WebDriver driver;
	
	public void firefox_launch() throws InterruptedException {
		
		System.setProperty(Firefox_key, Firefox_value);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.online.citibank.co.in/");
	Set<String>	parent_chilld = driver.getWindowHandles();
	int count = 	parent_chilld.size();
	}

	
	public void chrome_launch() throws InterruptedException {
		
		System.setProperty(Chorme_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.online.citibank.co.in/");
		Set<String>	parent_chilld = driver.getWindowHandles();
		int count = 	parent_chilld.size();
		System.out.println(count);
	}

}
