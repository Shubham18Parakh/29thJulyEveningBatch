package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabela {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");

		driver.findElement(By.id("mobileNumber")).sendKeys("7987208816");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).click();
		
	boolean Result=driver.findElement(By.xpath("//input[@id='mobileNumber']")).isEnabled();
	System.out.println("GeT oTp Button Status = " + Result);

	}

}
