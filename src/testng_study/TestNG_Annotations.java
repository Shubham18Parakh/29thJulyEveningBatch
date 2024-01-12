package testng_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Annotations {
  @Test
  public void x() 
  {
	  Reporter.log("TC x IS RUNNING", true); 
  }

@Test
public void z()
{
	
	 Reporter.log("TC  z IS RUNNING", true);
	
}
@Test
public void y() 
{
	 Reporter.log("TC y IS RUNNING", true);  
	
}
}