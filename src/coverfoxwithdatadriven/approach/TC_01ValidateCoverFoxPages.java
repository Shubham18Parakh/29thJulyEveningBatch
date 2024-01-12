package coverfoxwithdatadriven.approach;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonlyusedmethods_study.TestingByFatching;

public class TC_01ValidateCoverFoxPages {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		

//		FileInputStream myfile = new FileInputStream("C:\\Users\\user\\Documents\\Desktop\\coverfoxdatastore.xlsx");
//		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("coverfoxdata");
//		String ageData = mysheet.getRow(0).getCell(0).getStringCellValue();
//		String pincodeData = mysheet.getRow(0).getCell(1).getStringCellValue();
//		String mobileData = mysheet.getRow(0).getCell(2).getStringCellValue();
		
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
		memberdetails.handleAgeDropDown(TestingByFatching.readexcelsheet("coverfoxdata", 0, 0));
		memberdetails.clickOnNextButton();
		CoverFoxAdressDetailsPage adressdetails= new CoverFoxAdressDetailsPage(driver);
		adressdetails.enterPinCode(TestingByFatching.readexcelsheet("coverfoxdata", 0, 1));
		adressdetails.enterMobileNumber(TestingByFatching.readexcelsheet("coverfoxdata", 0, 2));
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
