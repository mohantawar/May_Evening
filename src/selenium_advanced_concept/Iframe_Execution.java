package selenium_advanced_concept;

import java.io.IOException;

public class Iframe_Execution extends Iframe{
	public static void main(String[]args) throws InterruptedException, IOException {
		Iframe_Execution obj = new Iframe_Execution ();
		obj.chrome_launch();
		Thread.sleep(5000);
		driver.close();
	}

}
