package testng_study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ALL_Annotaions_Use {
  @Test
  public void demo1()
  {
	  Reporter.log("demo1 is Running", true);  
  }
  @Test
  public void demo2()
  {
	  Reporter.log("demo2 is Running", true);  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("before method is Running", true);  
  }

  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("after method is Running", true);  
  }

  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("before class is Running", true);  
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("after class is Running", true);  
  }

  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("before test is Running", true);  
  }

  @AfterTest
  public void afterTest()
  {
	  
	  Reporter.log("after test is Running", true);  
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  Reporter.log("before suit is Running", true);  
  }

  @AfterSuite
  public void afterSuite()
  {
	  Reporter.log("after suite is Running", true);  
  }

}
