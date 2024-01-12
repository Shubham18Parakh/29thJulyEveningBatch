package testNgAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NormalTestValidation {
  @Test
  public void validateFBGenderCheckBox() throws InterruptedException
  
  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	  driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(700);
	boolean radioButtonSelectionStatus = driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
	  
	  System.out.println("Female radio Button Status is " + radioButtonSelectionStatus);
	  Assert.assertTrue(radioButtonSelectionStatus,"TC is Failled Radio Button is Not selected");
//	  if(radioButtonSelectionStatus) 
//	  {
//		  System.out.println("Radio Button Is Selected,TC is Passed");
//	  }
//	  else
//	  {
//		  System.out.println("Radio Button Is not Selected, so TC is Failled");
//	  }
	  
  }
}
