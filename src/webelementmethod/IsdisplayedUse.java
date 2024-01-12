package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsdisplayedUse {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		//driver.findElement(By.id("hide-textbox")).click();
		boolean Result=driver.findElement(By.name("show-hide")).isDisplayed();
		System.out.println("Displayed status is= " + Result);
		
		driver.findElement(By.name("show-hide")).sendKeys("Good Evening");
		driver.findElement(By.id("hide-textbox")).click();

	}

}
