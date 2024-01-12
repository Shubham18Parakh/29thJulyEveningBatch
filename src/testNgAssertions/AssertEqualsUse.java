package testNgAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void f()
  
  {
	  
	  String a = "Mandsaur";
	  String b = "Mandsaur";
	  String c = "Mumbai";
	  
	  //Verify a and b are Equall
	//  Assert.assertEquals(a, b ,"A and B are Not Matching so Test Case is failled");	  
	  //verify b and c are not equall
	  
	  Assert.assertNotEquals(b, c, " B and C are Equall Tc is failled ");
	  
	  
  }
}
