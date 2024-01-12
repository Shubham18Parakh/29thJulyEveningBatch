package listners_study;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listners2 implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		String TCName = result.getName();
		Reporter.log("TC " + TCName + " Is Completed Succussfully Listerns2", true);
		
		
	}
	

	@Override
	public void onTestStart(ITestResult result)
	{
	
		Reporter.log("TC " + result.getName() + " Execution Is Started Listerns2 ", true);
		
	}
}
