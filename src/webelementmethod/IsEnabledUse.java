package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledUse {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login");
		Thread.sleep(500);
		driver.findElement(By.id("mobileNumber")).sendKeys("9074860146");
		Thread.sleep(100);
		driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
	
		boolean Result =driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
		System.out.println("Get Otp Botton Status " + Result);
		
		

	}

}
