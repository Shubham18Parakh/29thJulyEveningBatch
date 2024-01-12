package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLASSPRACTICE {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//h2[contains(text(),'people in your life.')]"));
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("parakhshubham18@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234555");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		
		driver.get("https://www.zomato.com/india");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='sc-3o0n99-5 sc-ccLTTT GoOgn'])[2]")).click();
	driver.close();

	}

}
