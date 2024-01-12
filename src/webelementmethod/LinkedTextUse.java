package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTextUse {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.triveniturbines.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Parts & Service")).click();
		//driver.findElement(By.partialLinkText("& Service")).click();
		
		
	

	}

}
