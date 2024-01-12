package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticigDailyMock {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		//1.Sendkeys method use
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shubham123@gmail.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shubham3@gmail.com");
		Thread.sleep(1000);
		//2.clear method use
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		Thread.sleep(700);
		//3.using id locators
		driver.findElement(By.id("email")).sendKeys("12345absce");
		Thread.sleep(700);
		//4.using name locators
		driver.findElement(By.name("pass")).sendKeys("shubham18@");
		Thread.sleep(600);
		//5.using class name locators with click method
		driver.findElement(By.className("_97w4")).click();
	}

}
