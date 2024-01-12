package acko_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AckoHomePage {

	
	@FindBy(xpath ="//div[text()='Health']" ) private WebElement health_Icon;
	
	@FindBy(xpath = "//button[text()='Check prices']") private WebElement check_Price_Button;
	
	
	public AckoHomePage (WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnHealthIcon()
	{
		health_Icon.click();
	}
	public void clickOnCheckPriceButton()
	{
		check_Price_Button.click();
	}
	
}
