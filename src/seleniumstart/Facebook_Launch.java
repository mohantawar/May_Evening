package seleniumstart;

import java.io.IOException;

public class Facebook_Launch extends Facebook_Login{
	
	public static void main(String[]args) throws InterruptedException, IOException {
		Facebook_Login b = new Facebook_Login(); 
		b.chrome_launch();
		Thread.sleep(5000);
		driver.close();
		b.firefox_launch();
		Thread.sleep(10000);
		driver.close();
		b.opera_launch();
	}

}
