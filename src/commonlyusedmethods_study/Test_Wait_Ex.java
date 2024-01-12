package commonlyusedmethods_study;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Test_Wait_Ex {

	public static void implicitwait (WebDriver driver , int time) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	
		
	}
	
	
}
