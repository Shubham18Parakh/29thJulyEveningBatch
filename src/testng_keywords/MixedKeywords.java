package testng_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MixedKeywords {
  @Test(dependsOnMethods = {"d"})
  public void a()
  {
	  Reporter.log("Tc A is Running", true);
  }
  @Test()
  public void b()
  {
	  Reporter.log("Tc B is Running", true);
  }
  @Test(enabled = true)
  public void c()
  {
	  Reporter.log("Tc C is Running", true);
  }
  @Test(invocationCount = 3)
  public void d()
  {
	  Reporter.log("Tc D is Running", true);
  }
  @Test(timeOut = 5000)
  public void e() throws InterruptedException
  {
	  Thread.sleep(4000);
	  Reporter.log("Tc E is Running", true);
  }
  @Test(priority =-1 )
  public void f()
  {
	  Reporter.log("Tc F is Running", true);
  }
}
