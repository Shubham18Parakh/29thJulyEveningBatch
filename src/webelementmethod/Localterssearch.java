package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Localterssearch {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.indeed.com/?r=us");
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@id='text-input-what']")).sendKeys("software tester");

	}

}
