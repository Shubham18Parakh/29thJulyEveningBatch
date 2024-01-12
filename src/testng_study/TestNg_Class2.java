package testng_study;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_Class2 {
  @Test
  public void mymethod ()
  {
	 System.out.println("Hi This Is Printing Statement"); 
	 Reporter.log("Hi This Is Reporter Without Boolean Parameter");
	 Reporter.log("Hi This is Reporter With Boolean Parameter" ,true);
	  
  }
}
