package seleniumstart;

public interface CommonProperties {
  String Chrome_key = "webdriver.chrome.driver";
  String Chrome_value = "E:\\Setup\\ChromeDriver92_SeleniumFile\\chromedriver_win32\\chromedriver.exe";
  String Firefox_key = "webdriver.gecko.driver";
  String Firefox_value = "E:\\Setup\\FirefoxDriver\\geckodriver-v0.29.1-win64\\geckodriver.exe";
  String Edge_key = "webdriver.edge.driver";
  String Edge_value =  "E:\\Setup\\Edge\\edgedriver_win64\\msedgedriver.exe";
  String Opera_key  = "webdriver.opera.driver";
  String Opera_value = "E:\\Setup\\OperaDriver\\operadriver_win64\\operadriver_win64\\operadriver.exe";
  String Internet_explorer_key = "webdriver.ie.driver";
  String Internet_explorer_value = "E:\\Setup\\InternetExplorerDriver\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe";
  
   String url1 = "https://www.youtube.com/";
   String url2 = "https://en-gb.facebook.com/";
   String url3 = "https://www.instagram.com/";
   String url4 = "https://www.onlinesbi.com/";
   String url5 = "https://www.hdfcbank.com/";
  
  
  public void chromelaunch();
  public void firefoxlaunch();
  public void edgelaunch();
  public void operalaunch();
  public void internetexplorer();
}
