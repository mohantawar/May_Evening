package seleniumstart;

public interface Common_Features_Relative_Path {
	String Chorme_key = "webdriver.chrome.driver";
	String Chrome_value = "E:\\Setup\\ChromeDriver92_SeleniumFile\\chromedriver_win32\\chromedriver.exe";
    
	String Firefox_key = "webdriver.gecko.driver";
	String Firefox_value = "E:\\Setup\\FirefoxDriver\\geckodriver-v0.29.1-win64\\geckodriver.exe";
	
	public  void firefox_launch() throws InterruptedException;
	public  void chrome_launch() throws InterruptedException;
	
	String url = "https://www.google.com/account/about/";
}
