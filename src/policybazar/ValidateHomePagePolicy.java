package policybazar;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateHomePagePolicy {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
PolicyBazarHomePage home = new PolicyBazarHomePage(driver);

home.clickOnSignInButton();
home.enterMobileNumber();
home.clickOnSignButtonBelowMobField();
	}

}
