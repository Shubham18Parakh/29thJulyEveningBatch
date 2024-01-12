package coverFoxUsingTestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.reporters.jq.ResultsByClass;

public class TC_001ValidateCoverFoxPages {
  WebDriver driver;
	CoverFoxHomePage home;
	CoverFoxHealthPlanPage healthPlanPage;
	CoverFoxAdressDetailsPage adressDetailsPage;
	CoverFoxMemeberDetailsPage memeberDetailsPage;
	CoverFoxHealthPlanResultPage resultPage;
	
	@BeforeClass
	public void launchingBrowser() 
	{
		 driver = new ChromeDriver();
		home = new CoverFoxHomePage(driver);
		healthPlanPage= new CoverFoxHealthPlanPage(driver);
		adressDetailsPage= new CoverFoxAdressDetailsPage(driver);
		memeberDetailsPage = new CoverFoxMemeberDetailsPage(driver);
		resultPage = new CoverFoxHealthPlanResultPage(driver);
		Reporter.log("Opening Browser", true);
		driver.get("https://www.coverfox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
	}
	@BeforeMethod
	public void enterMemberDetails() throws InterruptedException
	{
		Reporter.log("Clicking on Gender Button", true);
		home.clickOnMaleButton();
		Thread.sleep(1000);
		Reporter.log("Clicking On Next Button", true);
		healthPlanPage.clickOnNextButton();
		Thread.sleep(1000);
		Reporter.log("Handling Age DropDown", true);
		memeberDetailsPage.handleAgeDropDown("28");
		Thread.sleep(1000);
		Reporter.log("Clicking On Next Button", true);
		memeberDetailsPage.clickOnNextButton();
		Thread.sleep(1000);
		Reporter.log("Entering Pincode", true);
		adressDetailsPage.enterPinCode("458001");
		Thread.sleep(1000);
		Reporter.log("Entering Mobile Number", true);
		adressDetailsPage.enterMobileNumber("9074860146");
		Thread.sleep(1000);
		Reporter.log("Clicking On Continue Button", true);
		adressDetailsPage.clickOnContinueButton();
		Thread.sleep(1000);
	}
	
	
	@Test
  public void validateTestPlansFromTextAndBanners() throws InterruptedException 
  {
		Reporter.log("Fatching Number Of Result From Text", true);
		int textResult = resultPage.availablePlanNumberFromText();
		Thread.sleep(7000);
		Reporter.log("Fatching Number Of Result From banners", true);
		int bannerResult = resultPage.availablePlanNumberFromBanner();
		Thread.sleep(2000);
	  Assert.assertEquals(textResult,bannerResult,"Text result not matching with banner result so test case failled.");
	  Reporter.log("Tc is passed", true);
  }
	@AfterClass
	public void closingBrowser() throws InterruptedException
	{
	Reporter.log("Closing Browser", true);
	Thread.sleep(7000);
	driver.close();
	}
}
