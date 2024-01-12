package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_Text_IndexUSE {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(500);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		//1.xpath by contains atribute
		
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("PUNE");
		Thread.sleep(700);
		
		//2.xpath by index
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("MANDSAUR");
		Thread.sleep(1000);
		
		//3.xpath by contains text method
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).click();
	Thread.sleep(1000);
	//partial text
	
	
	driver.findElement(By.xpath("//h2[contains(text(),'your life.')]")).click();
	Thread.sleep(1000);

	//partial value by xpath atribute
	driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();
	
		//driver.close();
				
		

}
}
