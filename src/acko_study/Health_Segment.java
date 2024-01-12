package acko_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Health_Segment {

	
	@FindBy(xpath = "//div[text()='Buy a new plan']") private WebElement buyNewPlanButton;
	
	
	
	
	public Health_Segment(WebDriver driver) 
	{
		PageFactory.initElements(driver , this );
	}
	
	public void ClickOnBuyNewPlanButton()
	{
		buyNewPlanButton.click();
	}
}