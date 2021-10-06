package seleniumstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Concrete_BasicMethods extends BasicMethods_Selenium {

	static WebDriver driver;
	static String ExpUrl =  "https://www.coep.org.in/";  
	static String ExpTitle = "Welcome to College of Engineering, Pune | College of Engineering, Pune";
     
	
	public void chrome_launch() {
		System.setProperty(Chrome_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		String ActUrl = driver.getCurrentUrl();
		if(ExpUrl.equals(ActUrl)) {
			System.out.println("Test scenario is passed and result "+ActUrl);
		}
		else {
			System.out.println("Test scenario is failed");
		}
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		if(ExpTitle.equals(ActTitle)) {
			System.out.println("Test scenario is passed and result "+ActTitle);
		}
		else {
			System.out.println("Test scenario is failed ");
		}
	}
	

}
