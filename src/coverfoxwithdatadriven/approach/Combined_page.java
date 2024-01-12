package coverfoxwithdatadriven.approach;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Combined_page {
	
	@FindBy(xpath = "//div[text()='Preferred brands']") private WebElement priferredBrands;
	
	@FindBy(xpath = "//span[text()='Aditya Birla Health Insurance']") private WebElement adityBirla;
	
   @FindBy(className = "apply-btn") private WebElement apply_Button;
   
   @FindBy(xpath = "//div[contains(text(),' Insurance Plans')]") private WebElement insuranceMatchingPlansResultInString;
   
   @FindBy(id = "plans-list") private List <WebElement> plans_list_Of_Aditya_Birla;
   
   public Combined_page(WebDriver driver) 
   {
	   PageFactory.initElements(driver,this);
   }
   public void clickOnPriferredBrands()
   {
	   priferredBrands.click();
   }
   public void clickOnAdityaBirlaOption()
   {
	   adityBirla.click();
   }
   public void clickOnApplyButton() 
   {
	   apply_Button.click();
   }
   public void insuranceMatchingPlans() 
   {
	  String text = insuranceMatchingPlansResultInString.getText();
	 String pr[] = text.split(" ");
	  String NumberOfRsltInString = pr[0];
	//now converting string into integer
	  int NumOfResltIn_Int = Integer.parseInt(NumberOfRsltInString);
	  
	int TotalNumberOfAdityaBirlaPlans = plans_list_Of_Aditya_Birla.size();
	System.out.println("TotalNumberOfAdityaBirlaPlans = " + TotalNumberOfAdityaBirlaPlans);
	
	if(TotalNumberOfAdityaBirlaPlans==NumOfResltIn_Int) 
	{
		System.out.println("Aditya Birla Plan List matching with available plans numbers test case is passed");
	}
	else 
	{
		System.out.println("Aditya Birla Plan List not matching with available plans numbers so test case Failled");
	}
	  
   }
   
   
   
   
}
