package testng_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listners_study.Listners.class)

public class MIneClass2 {
  @Test
  public void e() 
  
  {
	  
	  Reporter.log("Hey e is Running", true);
	  
  }
  @Test
  public void f() 
  
  {
	  Assert.fail();
	  Reporter.log(" Hey f is Running", true);
	  
	  
  }
  @Test(dependsOnMethods = {"f"} )
  public void g() 
  
  {
	  
	  Reporter.log("Hey g is Running", true);
	  
  }
  @Test
  public void h() 
  
  {
	  
	  Reporter.log("Hey h is Running", true);
	  
  }
}
