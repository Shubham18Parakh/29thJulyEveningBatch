package testng_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PRATICE {
 
  @Test
  public void bhavya() 
  {
	  
	  Reporter.log("My name is bhavya", true);
  }
    @Test(enabled = true)
  public void dherya() 
  {
	  
	  Reporter.log("My name is dhreya", true);
  }
  @Test(priority = -1)
  public void emli() 
  {
	  
	  Reporter.log("My name is emli", true);
  }
 

  @Test(dependsOnMethods = {"dherya"})
  public void Aditi() 
  {
	  
	  Reporter.log("My name is Aditi", true);
  }
  @Test(enabled = true)
  public void chaitali() 
  {
	  
	  Reporter.log("My name is chaitali", true);
  }
  @Test(priority = -2,dependsOnMethods = {"Aditi"})
  public void bhumi() 
  {
	  
	  Reporter.log("My name is bhumi", true);
  }
}
