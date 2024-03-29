
package coverfoxwithdatadriven.approach;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAdressDetailsPage {

	
	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement pinCodeField;
	
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobileNumberField;
	
	@FindBy(xpath = "//div[text()='Continue']") private WebElement continueButton;
	
	
	public CoverFoxAdressDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	public void enterPinCode(String pincode)
	{
		pinCodeField.sendKeys(pincode);
	}
	public void enterMobileNumber(String MobNo)
	{
		mobileNumberField.sendKeys(MobNo);
	}
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
}
