package actionsclassstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KEYBoardActions {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("day"));
		Actions act = new Actions(driver);
		act.click(day).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		act.click(day).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		act.click(day).perform();
		for(int i=0; i<=20; i++) 
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(500);
			
		}
		act.sendKeys(Keys.ENTER).perform();
		//TASK--->>>.NAME PASSED IN TEXT FIELD SHOULD BE IN CAPITAL LETTERS
		WebElement firstnameField = driver.findElement(By.name("firstname"));
		//act.sendKeys(firstnameField, "JAI JINENDRA").perform();
		//NEXT TASK--->>>.NAME PASSED IN TEXT FIELD SHOULD BE IN SMALL LETTERS only first letter is capital
		act.sendKeys(firstnameField, Keys.SHIFT).sendKeys("J").keyUp(Keys.SHIFT).sendKeys("ai jinendra").build().perform();
		
			}

}
