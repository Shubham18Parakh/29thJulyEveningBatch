package actionsclassstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollinUsingActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		WebElement sunday = driver.findElement(By.id("sunday"));
		WebElement monday = driver.findElement(By.id("monday"));
		WebElement tuesday = driver.findElement(By.id("tuesday"));
		Thread.sleep(500);
		Actions act = new Actions(driver);
		act.scrollToElement(tuesday).perform();
		Thread.sleep(500);
		sunday.click();
		Thread.sleep(500);
		monday.click();
		Thread.sleep(500);
		tuesday.click();
		Thread.sleep(500);
	}

}
