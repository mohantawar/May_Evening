package selenium_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Implementation implements CommonProperties{
	
    static WebDriver driver;
    String ExpUrl =  "https://web.whatsapp.com/";
    String ExpTitle = "WhatsApp";
    
    public void chrome_launch() throws InterruptedException {
    	
    	System.setProperty(chrome_key, chrome_value);
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get(url);  // 1.phonepay
    	Thread.sleep(3000); 
    	driver.get(url1); //2. insta
    	Thread.sleep(3000);
    	driver.get(url2); // 3.zomato
    	Thread.sleep(3000);
    	driver.get(url3); // 4.whatsapp
    	driver.navigate().back(); // zomato
    	Thread.sleep(3000);
    	driver.navigate().back(); //insta
    	Thread.sleep(3000);
    	driver.navigate().back(); //phonepay
    	Thread.sleep(3000);
    	driver.navigate().forward();
    	Thread.sleep(3000);
    	driver.navigate().forward();
    	Thread.sleep(3000);
    	driver.navigate().forward();
    	Thread.sleep(3000);
    	driver.navigate().refresh();
    	String ActUrl = driver.getCurrentUrl();
    	System.out.println(ActUrl);
    	String ActTitle = driver.getTitle();
    	System.out.println(ActTitle);
    	
    	if(ExpUrl.equals(ActUrl)) {
    		System.out.println("Test case Scenario passed = "+ ActUrl);
    	}
    	else {
    		System.out.println("Test case failed");
    	}
    	if(ExpTitle.equals(ActTitle)) {
    		System.out.println("Test case Scenario passed ="+ ActTitle);
    	}
    	else {
    		System.out.println("Test case failed");
    	}
    }
     
}
