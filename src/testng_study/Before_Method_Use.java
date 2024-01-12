package testng_study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Before_Method_Use {
	
	@BeforeMethod
	  public void LogInMethod()
	  {
		  Reporter.log("login is successed", true);
		  
	  }
	
	
  @Test
  public void method2()
  {
	  Reporter.log("Method2 is Running", true);
	  
  }
  @Test
  public void method1()
  {
	  Reporter.log("Method1 is Running", true);
	  
  }
  

  @AfterMethod
  public void LogOutMethod()
  {
	  Reporter.log("login-out Done", true);
	  
  }

}
