package listners_study;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listners implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		String TCName = result.getName();
		Reporter.log("TC " + TCName + " Is Completed Succussfully", true);
		
		
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{

		Reporter.log("TC "+ result.getName() + " Is Skipped Please Check Dependent Method", true);
		
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{

		Reporter.log("TC " + result.getName() + " Is Failled Please Check Again", true);
		
	}
	@Override
	public void onTestStart(ITestResult result)
	{
	
		Reporter.log("TC " + result.getName() + " Execution Is Started ", true);
		
	}
}
