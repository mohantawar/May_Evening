package seleniumstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaLaunch {
public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.opera.driver", "E:\\Setup\\OperaDriver\\operadriver_win64\\operadriver_win64\\operadriver.exe");
	
	WebDriver opera = new OperaDriver();
	opera.manage().window().maximize();
	opera.get("https://www.selenium.dev/");
	Thread.sleep(3000);
	opera.close();
}
}
