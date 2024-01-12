package commonlyusedmethods_study;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_2_Scrolling {
	
	public static void scrollIntoView(WebDriver driver,WebElement element) 
	{
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	js.executeScript("arguments[0].scrollIntoView();",element );
	
	}
	
	

}
