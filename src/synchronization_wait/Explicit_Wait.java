package synchronization_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login");
		driver.findElement(By.id("mobileNumber")).sendKeys("7898976238");
		WebElement getOtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(5000));
		driver.findElement(By.id("mobileNumber")).sendKeys("7987208816");
		
       w.until(ExpectedConditions.elementToBeClickable(getOtpButton));
       getOtpButton.click();

	}

}
