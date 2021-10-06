package seleniumstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserNavigationLaunch implements CommonProperties{
 
	static WebDriver driver;
	
	public void chromelaunch() {
		System.setProperty(Chrome_key, Chrome_value);
		driver = new ChromeDriver();
		driver.navigate().to(url2); // driver.get();
	}

	
	public void firefoxlaunch() {
		System.setProperty(Firefox_key, Firefox_value);
		driver = new FirefoxDriver();
		driver.navigate().to(url1);
		
	}

	
	public void edgelaunch() {
		System.setProperty(Edge_key,Edge_value);
		driver = new EdgeDriver();
		driver.navigate().to(url3);
		
	}

	
	public void operalaunch() {
		System.setProperty(Opera_key, Opera_value);
		driver = new OperaDriver();
		driver.navigate().to(url4);
		
	}

	
	public void internetexplorer() {
		System.setProperty(Internet_explorer_key, Internet_explorer_value);
		driver = new InternetExplorerDriver();
		driver.navigate().to(url5);
		
	}

}
