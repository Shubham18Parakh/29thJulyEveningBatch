package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabaledEx1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7987208816");
	boolean Result=driver.findElement(By.xpath("//button[text()='Request OTP']")).isEnabled();
	System.out.println("Reuested OTP button status = " + Result );
		

	}

}
