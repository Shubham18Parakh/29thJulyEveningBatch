package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SekeysclickclearUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(700);
		driver.get("https://www.facebook.com/login/");
		//1>>>Sendkeys Method Use
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shubham18@gmail.com"); 
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("parakh18@gmail.com"); //method overloading
		//2>>>clear Method Use
		Thread.sleep(700);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(1000);
		//3>>USING id LOCATORS
		driver.findElement(By.id("email")).sendKeys("velocity123@yahoo.com");
		Thread.sleep(700);
		//4>>USING name LOCATORS
		driver.findElement(By.name("pass")).sendKeys("123abcd");
		Thread.sleep(600);
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(700);
		//5>>>USING class name LOCATORS WITH click method
		driver.findElement(By.className("_97w4")).click();
		driver.close();
	
	}

}
