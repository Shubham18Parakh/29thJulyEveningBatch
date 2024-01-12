package policybazar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBazarHomePage {
	
	
	
	@FindBy(xpath ="//a[@class='sign-in']" )  private WebElement signin_ButtonHomePage;
	
@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobileNumberField;

@FindBy(xpath = "(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPasswor;


public PolicyBazarHomePage(WebDriver driver) {
	
	
	PageFactory.initElements(driver, this);
}
public void clickOnSignInButton()
{
	signin_ButtonHomePage.click();
}
public void enterMobileNumber() 
{
	mobileNumberField.sendKeys("7987208816");
}
public void clickOnSignButtonBelowMobField() 
{
	signInWithPasswor.click();
}
}
