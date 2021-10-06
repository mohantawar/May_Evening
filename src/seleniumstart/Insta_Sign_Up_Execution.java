package seleniumstart;

public class Insta_Sign_Up_Execution extends Instagram_SignUp{

	public static void main(String[]args) throws InterruptedException {
		
		Insta_Sign_Up_Execution obj = new Insta_Sign_Up_Execution();
		obj.chrome_launch();
		Thread.sleep(3000);
		driver.close();
		obj.firefox_launch();
		Thread.sleep(3000);
		driver.close();
		
	}
}
