package seleniumstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.ie.driver", "E:\\Setup\\InternetExplorerDriver\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
		WebDriver ie = new InternetExplorerDriver();
	//	ie.get("https://www.selenium.dev/");
		ie.get("https://www.facebook.com/");
		
	}

}
