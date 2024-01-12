package framework_Use;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabInventoryPage {
	
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt") private WebElement tshirtAddToCartButton;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement backpackAddToCartButton;
	
	@FindBy(name = "add-to-cart-sauce-labs-bike-light") private WebElement bikeLightAddToCartButton;
	
	
	
	//constructor
	
	public SwagLabInventoryPage (WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	//methods
	
	public void addTshirtToCart() 
	{
		tshirtAddToCartButton.click();
	}
	public void addbackpackToCart()
	{
		backpackAddToCartButton.click();
	}
	public void addBikeLightToCart() 
	{
		bikeLightAddToCartButton.click();
	}
}
