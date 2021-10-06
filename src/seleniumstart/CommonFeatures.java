package seleniumstart;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public abstract class CommonFeatures {
	String Chorme_key = "webdriver.chrome.driver";
	String Chrome_value = "E:\\Setup\\ChromeDriver92_SeleniumFile\\chromedriver_win32\\chromedriver.exe";

	String Firefox_key = "webdriver.gecko.driver";
	String Firefox_value = "E:\\Setup\\FirefoxDriver\\geckodriver-v0.29.1-win64\\geckodriver.exe";

	public abstract void firefox_launch() throws InterruptedException;

	public abstract void chrome_launch() throws InterruptedException, IOException;

	public static void takesnapshot(WebDriver d, String FilePath) throws IOException {

		File soucrce = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		File Destination = new File(FilePath);
		FileHandler.copy(soucrce, Destination);
	}

	String url = "https://en-gb.facebook.com/";
	String url1 = "https://www.instagram.com/";
	String url2 = "https://www.swiggy.com/";
	String url3 = "https://www.naukri.com/";
}
