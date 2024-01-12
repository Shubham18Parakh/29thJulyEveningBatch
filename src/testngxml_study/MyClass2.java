package testngxml_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass2 {
  @Test(groups = "Sanity")
  public void T5()
  {
	  Reporter.log("Tc5 is Running", true); 
  }
  @Test(groups = {"Regression","Sanity"})
  public void Tc6()
  {
	  Reporter.log("Tc6 is Running", true); 
  }
  @Test(groups = "Regression")
  public void Tc7()
  {
	  Reporter.log("Tc7 is Running", true); 
  }
  @Test(groups = "Sanity")
  public void Tc8()
  {
	  Reporter.log("Tc8 is Running", true); 
  }
}
