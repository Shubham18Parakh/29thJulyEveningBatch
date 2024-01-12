package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownex2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jainmilap.com/registration");
		Thread.sleep(2000);
		WebElement Highest_Qualification = driver.findElement(By.id("qualification"));
		Select s=new Select(Highest_Qualification);
		s.selectByValue("IAS/IPS/Others");

	}

}
