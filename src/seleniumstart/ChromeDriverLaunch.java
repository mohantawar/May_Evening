package seleniumstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverLaunch {
public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","E:\\Setup\\ChromeDriver92_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://en-gb.facebook.com/");
	Thread.sleep(3000);
	//d.close();
	d.quit();
}
}
