package testng_study;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Before_Class_Study {
	
	@BeforeClass
	  public void beforeclass () 
	  {
		  Reporter.log("Open Browser Class", true);
		    
	  }
	 @BeforeMethod
	  public void beforemethod()
	  {
		  Reporter.log("Login successful", true);
	  }

  @Test
  public void tc01 () 
  {
	  
	  Reporter.log("Tc01 is running", true);
  }
  
  @AfterMethod
  public void aftermethod()
  {
	  Reporter.log("log-out done", true);
  }
  
  @AfterClass
  public void afterclass() 
  {
	  Reporter.log("Close Browser", true);
  }
 
}
