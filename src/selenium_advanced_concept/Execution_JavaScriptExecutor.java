package selenium_advanced_concept;

public class Execution_JavaScriptExecutor extends JavaScriptExecutor {
 
	public static void main(String[]args) throws InterruptedException {
		
		Execution_JavaScriptExecutor obj = new Execution_JavaScriptExecutor();
		obj.chrome_launch();
		driver.quit();
		
	}
}
