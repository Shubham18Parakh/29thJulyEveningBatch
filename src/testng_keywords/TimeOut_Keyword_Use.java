package testng_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut_Keyword_Use {
  @Test
  public void a() 
  {
	  
	Reporter.log("a is playing", true);
  }
  @Test(timeOut   = 5000)
  public void b() 
  {
	  Reporter.log("b is cheating", true);
	  
  }
  @Test
  public void c()
  {
	  Reporter.log("c is playing with emotions", true);
  }
  @Test
  public void d()
  {
	  Reporter.log("d is playing with me ", true);
  }
}
