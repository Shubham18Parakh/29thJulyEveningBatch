package dropdownuse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownStudy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(1000);
		WebElement drop_down = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		Select s =new Select(drop_down);
		System.out.println(s.isMultiple());
		Thread.sleep(1000);
		s.selectByVisibleText("Navigation Commands");
		Thread.sleep(500);
		s.selectByIndex(3);
		Thread.sleep(500);
		s.deselectByIndex(1);		
		Thread.sleep(500);
		s.deselectAll();
		
		
		
		
	}
}
	
