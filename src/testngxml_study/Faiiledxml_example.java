package testngxml_study;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Faiiledxml_example {
  @Test
  public void TC1()
  {
	
	  Reporter.log("TC1 is Running",true);	  
	  
  }
  @Test
  public void TC2()
  {
	//org.testng.Assert.fail();
	 
	  Reporter.log("TC2 is Running",true);	  
	  
  }
  @Test
  public void TC3()
  {
	//Assert.fail();
	  Reporter.log("TC3 is Running",true);	  
	  
  }
  @Test
  public void TC4()
  {
	
	  Reporter.log("TC4 is Running",true);	  
	  
  }
  @Test
  public void TC5()
  {
	
	  Reporter.log("TC5 is Running",true);	  
	  
  }
}
