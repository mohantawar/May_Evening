package selenium_package;

public interface CommonProperties {

	static String chrome_key = "webdriver.chrome.driver";
    static	String chrome_value = "E:\\Setup\\ChromeDriver92_SeleniumFile\\chromedriver_win32\\chromedriver.exe";
	
	static String url =" https://www.phonepe.com/";
	static String url1 =" https://www.instagram.com/";
	static String url2 = "https://www.zomato.com/kingman-ks";
	static String url3 = "https://web.whatsapp.com/";
	public void chrome_launch() throws InterruptedException;
}
