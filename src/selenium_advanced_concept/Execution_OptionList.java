package selenium_advanced_concept;

import java.io.IOException;

public class Execution_OptionList extends  OptionList {

	public static void main(String[]args) throws InterruptedException, IOException {
		Execution_OptionList obj = new Execution_OptionList();
		obj.chrome_launch();
		Thread.sleep(3000);
		driver.close();
	}
}
