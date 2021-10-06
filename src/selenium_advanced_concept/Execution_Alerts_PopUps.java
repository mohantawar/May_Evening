package selenium_advanced_concept;

import java.io.IOException;



public class Execution_Alerts_PopUps extends Alert_PopUps {

	public static void main(String[]args) throws InterruptedException, IOException {
		
		Execution_Alerts_PopUps obj = new  Execution_Alerts_PopUps();
		obj.chrome_launch();
		Thread.sleep(2000);
		Alert_PopUps obj1 = new Alert_PopUps();
		obj1.alert_pop_accept();
		Thread.sleep(2000);
		obj1.pop_up_alert_wait();
		Thread.sleep(2000);
		obj1.pop_up_alert_dismiss();
		Thread.sleep(2000);
		obj1.pop_up_alert_accept();
		Thread.sleep(2000);
		obj1.pop_up_alert_prompt_button();
		Thread.sleep(3000);
		driver.close();
		
	}
}
