package seleniumstart;

import java.io.IOException;

public interface Facebook {
   String chrome_key = "webdriver.chrome.driver";
   String chrome_value = "E:\\Setup\\ChromeDriver92_SeleniumFile\\chromedriver_win32\\chromedriver.exe";
    
    String url ="https://www.facebook.com/";
    String Firefox_key = "webdriver.gecko.driver";
	String Firefox_value = "E:\\Setup\\FirefoxDriver\\geckodriver-v0.29.1-win64\\geckodriver.exe";
    
	String Opera_key  = "webdriver.opera.driver";
	 String Opera_value = "E:\\Setup\\OperaDriver\\operadriver_win64\\operadriver_win64\\operadriver.exe";
	
  public void  chrome_launch() throws InterruptedException, IOException;
    public void firefox_launch();
    public void opera_launch() throws InterruptedException;
}
