package testng_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout_Keywords {
  @Test(timeOut = 4000)
  public void payment() throws InterruptedException 
  
  {
	  Thread.sleep(5000);
	  Reporter.log("Payment Method is Running", true);
	  
  }
  @Test
  public void order() 
  
  {
	  Reporter.log("order placed", true);
	  
  }
}
