package testNgAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalse {
  @Test
  public void f() 
  {
	  
	  boolean a = true;
	  boolean b = false;
	  //verify a is true
	  
	  Assert.assertTrue(a," a value is false so Tc IS Failled");
	  
	  //Assert.assertTrue(b," b value is false so Tc IS Failled");
	  
	  //verify b value is false
	  
	  Assert.assertFalse(b,"b value is true so TC is Failled");
	  
  }
}
