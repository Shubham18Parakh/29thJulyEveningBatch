package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBAccountForm {
  @Test(dataProvider ="FBSanity",dataProviderClass = FbDataProvider.class )
  public void f(String firstName, String lastName, String MobNum) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(1000);
	  driver.findElement(By.linkText("Create new account")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  Thread.sleep(1000);
	  driver.findElement(By.name("firstname")).sendKeys(firstName);
	  Thread.sleep(1000);
	  driver.findElement(By.name("lastname")).sendKeys(lastName);
	  Thread.sleep(1000);
	  driver.findElement(By.name("reg_email__")).sendKeys(MobNum);
	  //Thread.sleep(7000);
	 // driver.close();
	  

	  
	  
	  
	  
  }
}
