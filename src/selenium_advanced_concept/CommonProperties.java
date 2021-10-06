package selenium_advanced_concept;

import java.io.IOException;

public interface CommonProperties {
	String Chorme_key = "webdriver.chrome.driver";
	String Chrome_value = "E:\\Setup\\ChromeDriver92_SeleniumFile\\chromedriver_win32\\chromedriver.exe";
	
	public void chrome_launch() throws InterruptedException, IOException;
	String url = "http://demo.guru99.com/test/guru99home/";
	String url1 = "https://en-gb.facebook.com/";
	String url2 = "https://www.makemytrip.com/";
	String url4 = "https://www.globalsqa.com/demo-site/";
	String url5 = "https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html";
	String url6 = "https://paytm.com/recharge";
}
