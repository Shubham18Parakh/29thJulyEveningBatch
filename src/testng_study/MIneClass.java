package testng_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listners_study.Listners.class)

public class MIneClass {
  @Test
  public void a() 
  
  {
	  
	  Reporter.log("Hey a is Running", true);
	  
  }
  @Test
  public void b() 
  
  {
	  Assert.fail();
	  Reporter.log(" Hey b is Running", true);
	  
	  
  }
  @Test(dependsOnMethods = {"b"} )
  public void c() 
  
  {
	  
	  Reporter.log("Hey c is Running", true);
	  
  }
  @Test
  public void d() 
  
  {
	  
	  Reporter.log("Hey d is Running", true);
	  
  }
}
