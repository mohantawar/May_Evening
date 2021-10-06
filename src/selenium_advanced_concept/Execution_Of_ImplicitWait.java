package selenium_advanced_concept;

import java.io.IOException;

public class Execution_Of_ImplicitWait extends ImplicitlyWait_Is_Selected {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Execution_Of_ImplicitWait obj = new Execution_Of_ImplicitWait();
		// obj.chrome_launch();
//		Thread.sleep(2000);
//		driver.close();
		// ImplicitlyWait_IsEnabled is_enabled = new ImplicitlyWait_IsEnabled();
		// is_enabled.chrome_launch();
		ExplicitWait e = new ExplicitWait();
		e.chrome_launch();

	}

}
