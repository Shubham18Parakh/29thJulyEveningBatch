package testngxml_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass1 {
  @Test(groups ="Regression")
  public void Tc1()
  {
	  Reporter.log("Tc1 is Running", true); 
  }
  @Test(groups ="Regression")
  public void Tc2()
  {
	  Reporter.log("Tc2 is Running", true); 
  }
  @Test(groups ="Regression")
  public void Tc3()
  {
	  Reporter.log("Tc3 is Running", true); 
  }
  @Test(groups ="Sanity")
  public void Tc4()
  {
	  Reporter.log("Tc4 is Running", true); 
  }
}
