package testng_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_keyword {
  @Test
  public void a()
  {
	 Reporter.log("a is walking", true); 
	  
  }

@Test
public void b()
{
	Reporter.log("b is playing", true);
	  
}
@Test(priority = -1 )
public void c()
{
	  
	Reporter.log("c is jogiing", true);
}
@Test(priority = 2 )
public void d()
{
	Reporter.log("d is swimming", true); 
}	  

}