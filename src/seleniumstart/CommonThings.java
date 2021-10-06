package seleniumstart;

public interface CommonThings {
	String Chorme_key = "webdriver.chrome.driver";
	String Chrome_value = "E:\\Setup\\ChromeDriver92_SeleniumFile\\chromedriver_win32\\chromedriver.exe";
    
	public abstract void chrome_launch() throws InterruptedException ;
	
	String url = "https://en-gb.facebook.com/";
    String url1 = "https://www.naukri.com/";
}
