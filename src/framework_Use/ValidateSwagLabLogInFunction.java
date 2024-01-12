package framework_Use;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateSwagLabLogInFunction {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//Create Object Of PoM CLASS
		SwagLab_Loigin_Page login = new SwagLab_Loigin_Page(driver);
		
		login.enterUser_Name();
		login.enterpassword();
		login.clickOnLogInButton();
		
SwagLabInventoryPage inventory= new SwagLabInventoryPage(driver);
		
		inventory.addTshirtToCart();
		inventory.addbackpackToCart();
		inventory.addBikeLightToCart();
		
	}

}
