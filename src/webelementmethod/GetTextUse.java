package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(500);
		String exp_Result="Find your dream job now";
      String act_Result =driver.findElement(By.className("qsb-title")).getText();
   
      //WebElement MyElement= driver.findElement(By.className("qsb-title")).getText();
      System.out.println("My Actual Text is = " + act_Result );
      
      if(exp_Result.equals(act_Result))
  	{
  		System.out.println("Text Is Maching TC is passed");
  	}
      else {
    	  System.out.println("Text Is not Maching TC is failed");
      }
    	  
	}
	



}
