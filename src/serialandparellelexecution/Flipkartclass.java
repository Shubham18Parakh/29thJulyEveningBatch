package serialandparellelexecution;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkartclass{
@Test
public void flipkartTest()
{
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.flipkart.com/");
	
	
}
}
