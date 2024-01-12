package actionsclassstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUsingActions {

	public static void main(String[] args) throws InterruptedException {
		
		//FindOut the locator of webelement where we need to perform actions and store in some refrence variable
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		 WebElement logInButton = driver.findElement(By.name("login"));
      //create an object of an actions class which will accept driver object as a parameter
		 
		 Actions act = new Actions(driver);
		 //Using one of the Actions class method perform an action
		//1
		// act.moveToElement(logInButton).perform(); // curser will move upon targeted element
		// act.click().perform();
		 
		//2
		 // act.moveToElement(logInButton).click().build().perform();
		 
		//3 
		 act.click(logInButton).perform();
		 
		 //we performed above click action here from 3 diffrenet ways
		 
	}

}
