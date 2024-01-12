package testNgAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullNotNull {
  @Test
  public void f()
  {
	 String a ="pune";
	 String b = null;
	 
	 //verify a is not null
	 
	// Assert.assertNotNull(a,"a value is null so Tc FAIILED");
	  
	  //verify b is null
	 Assert.assertNull(b," b value is not null so Tc FAILLED");
	 
  }
}
