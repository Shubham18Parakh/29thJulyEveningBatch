package testNgAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionUse {
  @Test
  public void f()
  {
	String a = "Hello";
	String b = "Hi";
	
	SoftAssert s = new SoftAssert();
	s.assertEquals(a, b," A and B are Not Equall so Tc will be Failled");
	
	s.assertNull(a,"A is not null TC is Failled");
	
	s.assertAll();
	  
  }
  
  @Test
  public void m()
  {
	  //String a=null;
	  String a="Hi";
	  SoftAssert s1 = new SoftAssert();
	 // s1.assertNotNull(a,"A is Null so Test Case Failled ");
	  s1.assertNull(a," A is not null so Tc Is failled");
	  s1.assertAll();
  }
}
