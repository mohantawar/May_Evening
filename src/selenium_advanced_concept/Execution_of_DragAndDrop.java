package selenium_advanced_concept;

import java.io.IOException;

public class Execution_of_DragAndDrop extends DragAndDrop {

	
	public static void main(String[]args) throws InterruptedException, IOException {
		
		Execution_of_DragAndDrop obj = new Execution_of_DragAndDrop ();
		obj.chrome_launch();
		Thread.sleep(5000);
		driver.quit();
	}
}
