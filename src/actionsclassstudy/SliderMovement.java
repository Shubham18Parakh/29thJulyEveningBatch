package actionsclassstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderMovement {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		WebElement sliderMovement = driver.findElement(By.id("slider"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(sliderMovement, 50, 0).perform();
         Thread.sleep(500);
         act.dragAndDropBy(sliderMovement, -20, 0).perform();
	}

}
