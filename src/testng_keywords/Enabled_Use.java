package testng_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_Use {
  @Test()
   public void a() 
  {
	  Reporter.log("TC a Is Running", true);  
  }
  @Test
  public void b() 
 {
	  
	  Reporter.log("TC b Is Running", true);   
 }
  @Test(enabled = false )
  public void c() 
 {
	  
	  Reporter.log("TC c Is Running", true);  
 }
  @Test
  public void d() 
 {
	  Reporter.log("TC d Is Running", true);  
	  
 }
}
