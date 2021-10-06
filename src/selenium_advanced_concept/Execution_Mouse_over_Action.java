package selenium_advanced_concept;

import java.io.IOException;

public class Execution_Mouse_over_Action extends Mouse_Over_Action {

 public static void main(String[] args) throws InterruptedException, IOException {
	
	 Execution_Mouse_over_Action obj = new Execution_Mouse_over_Action();
	 obj.chrome_launch();
	 Thread.sleep(5000);
	 driver.close();
	 
}
}
