package testng_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_On_Methods {
  @Test
  public void payment() 
  {
	  Reporter.log("payment done", true);
	  
  }
  @Test
  public void cupponcode1() 
  {
	  Reporter.log("20% discount is done", true);
	  
  }
  @Test
  public void cupponcode2() 
  {
	  Reporter.log("50% discount is done", true);
	  
  }
  @Test(dependsOnMethods = {"cupponcode2"} ) //you will get TestNg exception when you use 2 cuppons at a time
  public void discount() 
  {
	  Reporter.log("discount is used", true);
	  
  }
  
  
}
