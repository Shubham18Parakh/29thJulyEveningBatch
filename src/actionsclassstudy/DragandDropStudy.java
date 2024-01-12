package actionsclassstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropStudy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		//click and hold source element and then move and release
		//1
		//act.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		//2
		//act.dragAndDrop(source, target).perform();
		//3
		act.clickAndHold(source).release(target).build().perform();
	

	}

}
