package coverfox;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC_01ValidateCoverFoxPages {

	public static void main(String[] args) {
		
	
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		
		CoverFoxHomePage home = new CoverFoxHomePage(driver);
		home.clickOnMaleButton();
		CoverFoxHealthPlanPage healthplanpage= new CoverFoxHealthPlanPage(driver);
		healthplanpage.clickOnNextButton();
		CoverFoxMemeberDetailsPage memberdetails= new CoverFoxMemeberDetailsPage(driver);
		memberdetails.handleAgeDropDown("25");
		memberdetails.clickOnNextButton();
		CoverFoxAdressDetailsPage adressdetails= new CoverFoxAdressDetailsPage(driver);
		adressdetails.enterPinCode("458001");
		adressdetails.enterMobileNumber("9923456780");
		adressdetails.clickOnContinueButton();
		CoverFoxHealthPlanResultPage results= new CoverFoxHealthPlanResultPage(driver);
		results.validatePlanListWithResults();
		Combined_page cp= new Combined_page(driver);
		cp.clickOnPriferredBrands();
		cp.clickOnAdityaBirlaOption();
		cp.clickOnApplyButton();
		cp.insuranceMatchingPlans();
	}

}
