package testNgAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertStudy {
  @Test
  public void f()
  
  {
	  String a = "Hi";
	  String b = "Hi"; //"bye";
	  
	  Assert.assertEquals(a, b,"a and b are not equall so tc failled");
	  
	  Assert.assertNotNull(a,"a value is null so Tc FAILLED");
	  
	  //IN A  SINGLE TEST CASE THERE IS MULTIPLE VALIDATION POINS 
	  
	  
	  
  }
  @Test
  public void m()
   
  {
	 String a = null;
	 Assert.assertNull(a);
  }
}
