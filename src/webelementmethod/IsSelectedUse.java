package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUse {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@value='2']")).isSelected();
		//boolean Result=driver.findElement(By.xpath("//input[@value='2']")).isSelected();
		//System.out.println("Gender selection status is " + Result);
		//driver.findElement(By.xpath("//input[@value='2']")).click();
		//driver.findElement(By.xpath("//input[@value='2']")).isSelected();
		WebElement Male_Gender =driver.findElement(By.xpath("//input[@value='2']"));
		boolean Result1=Male_Gender.isSelected();
		System.out.println("Gender selection status is " + Result1);
		Male_Gender.click();
		boolean Result2=Male_Gender.isSelected();
		System.out.println("Gender selection status is " + Result2);
		

	}

}
