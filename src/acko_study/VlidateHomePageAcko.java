package acko_study;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VlidateHomePageAcko {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 driver.get("https://www.acko.com/");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 
 
 AckoHomePage acko= new AckoHomePage(driver);
 acko.clickOnHealthIcon();
 acko.clickOnCheckPriceButton();
 Health_Segment hs=new Health_Segment(driver);
 hs.ClickOnBuyNewPlanButton();

	}

}
