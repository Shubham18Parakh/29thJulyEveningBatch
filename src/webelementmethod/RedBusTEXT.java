package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusTEXT {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Mandsaur");
	    Thread.sleep(300);
	   driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Ahmedabad");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='SEARCH BUSES']")).click();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
