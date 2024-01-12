package framework_Use;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLab_Loigin_Page {

	//Variables
	//methods 
	//constructor
	@FindBy(name = "user-name") private WebElement userNameField;
	@FindBy(id = "password") private WebElement passwordField;
	@FindBy(xpath = "//input[@class='submit-button btn_action']") private WebElement logInButton;
	
	//constructor
	
	public SwagLab_Loigin_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void enterUser_Name() 
	{
		userNameField.sendKeys("standard_user");
	}
	public void enterpassword() 
	{
		passwordField.sendKeys("secret_sauce");
	}
	public void clickOnLogInButton() 
	{
		logInButton.click();
	}
	
}
