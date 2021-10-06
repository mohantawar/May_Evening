package selenium_advanced_concept;

import java.io.IOException;

public class Execution_DropDown extends DropDown {
	
	public static void main(String[]args) throws InterruptedException, IOException {
		Execution_DropDown obj = new Execution_DropDown();
		obj.chrome_launch();
		driver.quit();
	}

}
