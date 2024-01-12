package popuphandling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(100);
		driver.findElement(By.xpath("//span[text()='Remote']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//span[text()='Banking & Finance']")).click();
		Set<String> allTabsId = driver.getWindowHandles();
		
	//converting SET into ARRAYLIST
		ArrayList<String> AL=new ArrayList<>(allTabsId);
		
		for(int i=0; i<=AL.size(); i++)
		{
			Thread.sleep(300);
			driver.switchTo().window(AL.get(i));
			Thread.sleep(300);
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
			//driver.close();
		}
		
	}
	

}
