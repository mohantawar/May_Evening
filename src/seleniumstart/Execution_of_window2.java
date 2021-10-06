package seleniumstart;

import java.io.IOException;

public class Execution_of_window2 extends MultipleWindow2{
public static void main(String[]args) throws InterruptedException, IOException {
	Execution_of_window2 obj = new Execution_of_window2();
	obj.chrome_launch();
	Thread.sleep(3000);
	driver.quit();
	MultipleWindow_Link2 obj2 = new MultipleWindow_Link2();
	obj2.chrome_launch();
	
}
}
