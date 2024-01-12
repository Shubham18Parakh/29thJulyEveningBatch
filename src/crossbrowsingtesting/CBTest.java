package crossbrowsingtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTest {
	
	
  @Test
  @Parameters("bName")
  public void f(String browserName) throws InterruptedException
  {
	  WebDriver driver = null;
	 if(browserName.equals("Chrome"))
	 {
	   driver = new ChromeDriver();
	 }
	 else if(browserName.equals("Firefox")) 
	 {
		  driver = new FirefoxDriver();
	 }
	  
	  
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(1000);
	  driver.findElement(By.linkText("Create new account")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  Thread.sleep(1000);
	  driver.findElement(By.name("firstname")).sendKeys("Shubham");
	  Thread.sleep(1000);
	  driver.findElement(By.name("lastname")).sendKeys("Parakh");
	  Thread.sleep(1000);
	  driver.findElement(By.name("reg_email__")).sendKeys("8828789076");
	  //Thread.sleep(7000);
	 // driver.close();
	  
	  
  }
}
