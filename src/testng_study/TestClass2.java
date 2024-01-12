package testng_study;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestClass2 {
  @Test
  public void Tc3()
  {
	  Reporter.log("Running Tc3", true); 
  }
  @Test
  public void Tc4()
  {
	  Reporter.log("Running Tc4", true); 
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("BEFORE METHOD IS RUNNING",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("AFTERE METHOD IS RUNNING",true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("BEFORE CLASS IS RUNNING",true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("AFTER CLASS IS RUNNING",true);
  }

}
