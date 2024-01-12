package commonlyusedmethods_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolingByCode_use {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trivenigroup.com/");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Test_Wait_Ex.implicitwait(driver, 5);
        WebElement BUSINESSES = driver.findElement(By.xpath("//h2[text()='BUSINESSES']"));
        Test_2_Scrolling.scrollIntoView(driver, BUSINESSES);

	}

}
