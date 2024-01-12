package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticingMock {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.get("https://demo.guru99.com/test/login.html");
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control']")).sendKeys("parakhshubham18@gmail.com");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("11234abcd");
       Thread.sleep(500);
       driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}

}
