package testNgAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;






public class AssinmenetBrowserLaunching {
  @Test
  public void f() 
  
  {
	WebDriver driver = new FirefoxDriver(); 
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");

	  
  }
}
