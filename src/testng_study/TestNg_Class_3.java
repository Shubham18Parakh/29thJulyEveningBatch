package testng_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_Class_3 {
  @Test
  public void fbLaunching() 
  {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  Reporter.log("Facebook Launching", true);
	  
  } 

@Test
public void instaLaunching() 
{
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.instagram.com/");
	  Reporter.log("Instagram Launching", true);
	  
} 

@Test
public void tweeterLaunching() 
{
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://twitter.com/");
	  Reporter.log("Twiter Launching", true);
	  
} 
}