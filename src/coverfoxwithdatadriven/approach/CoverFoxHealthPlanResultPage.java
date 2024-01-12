package coverfoxwithdatadriven.approach;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanResultPage {

	
	@FindBy(xpath = "//div[contains(text(),'49 matching Health')]") private WebElement resultsInString;
	
	@FindBy(id = "plans-list") private  List<WebElement> plansList;
	
	
	public CoverFoxHealthPlanResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver ,this);
		
	}
	
	
	
	public void validatePlanListWithResults() 
	{
		String test = resultsInString.getText();
		//49 matching Health Insurance Plans
		String ar[]=test.split(" ");
		String numberOfResultsInString = ar[0];
		//now converting string into integer
		int numOfResultsIn_Int = Integer.parseInt(numberOfResultsInString);
		
		int totalNumOfPlans = plansList.size();
		System.out.println(totalNumOfPlans);
		if(totalNumOfPlans==numOfResultsIn_Int)
		{
			System.out.println("plans number matching with plans list so test case is passed");
		}
		else 
		{
			System.out.println("plans number not matching with plans list so test case failled");
		}
	}
	
}
