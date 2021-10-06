package seleniumstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nilesh_Launch_Chrome implements Nilesh_Package{

	static WebDriver driver;
	@Override
	public void chromeLaunch() {
		
		System.setProperty(key1, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url1);
		
	}

	
}
