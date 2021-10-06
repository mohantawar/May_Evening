package seleniumstart;

public class Sign_Up_Execution extends Sign_Up_Facebook{
	public static void main(String[]args) throws InterruptedException {
		
		Sign_Up_Execution b = new Sign_Up_Execution();
		b.chrome_launch();
		Thread.sleep(5000);
		driver.close();
		b.firefox_launch();
		Thread.sleep(5000);
		driver.close();
		
		
		 
	}

}
