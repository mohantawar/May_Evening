package seleniumstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {
public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver", "E:\\Setup\\Edge\\edgedriver_win64\\msedgedriver.exe");
	WebDriver edge = new EdgeDriver();
	edge.get("https://www.selenium.dev/");
	Thread.sleep(3000);
	edge.close();
	
	
}
}
