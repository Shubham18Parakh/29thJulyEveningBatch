package testng_study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Shopping {
	
	WebDriver driver = new ChromeDriver();

	
	@BeforeClass
	  public void beforeClass() throws InterruptedException 
	{
		//WebDriver driver = new ChromeDriver();	
		driver.get("https://www.saucedemo.com/");
	
		driver.manage().window().maximize();
		
		Reporter.log("Launching saucedemo", true);	
	  }
	 @BeforeMethod
	  public void saucedemo_LogIn() throws InterruptedException
	 {
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 Thread.sleep(500);
			driver.findElement(By.id("password")).sendKeys("secret_sauce");	
			Thread.sleep(500);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(500);
	
		 Reporter.log("login-page is", true);
		 
	  }

  @Test
  public void click_Add_To_Cart_Button() throws InterruptedException
  {
	  driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	  Thread.sleep(500);
	  
	  Reporter.log("clicking on add to cart sauce-labs-backpack ", true);
  }
 
  @AfterMethod
  public void clickOn_LogOut_Button() throws InterruptedException
  {
	  driver.findElement(By.id("react-burger-menu-btn")).click();
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//a[text()='Logout']")).click();	 
	  Thread.sleep(500);
	  Reporter.log("saucedemo logout succesfully done", true);
	  Thread.sleep(1000);
  }

 

  @AfterClass
  public void afterClass() throws InterruptedException
  {
	  Thread.sleep(5000);
	  driver.close();
	  Reporter.log("Browser Closed!", true);
  }

}
