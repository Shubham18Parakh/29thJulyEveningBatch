package framework_Use;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement user_Name = driver.findElement(By.name("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login_Button = driver.findElement(By.name("login-button"));
		user_Name.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login_Button.click();
		
		WebElement back_pack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		back_pack.click();
		WebElement bike_Light = driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
		bike_Light.click();
		
		WebElement cart_Button = driver.findElement(By.id("shopping_cart_container"));
		cart_Button.click();
		List<WebElement> cart_Items = driver.findElements(By.className("inventory_item_name"));
		System.out.println("Number of Items are " + cart_Items.size());
		
		for(WebElement ci:cart_Items)
		{
			System.out.println("Items Are " + ci.getText());
		}
		//Validate items is same as what we want 
		Iterator<WebElement> it = cart_Items.iterator();
		
		WebElement itemNum_1 = it.next();
		WebElement itemNum_2 = it.next();
		
		if(itemNum_1.getText().equals("Sauce Labs Backpack"))
		
		{
			System.out.println("Selected Item is Correct As===>>Sauce Labs Backpack");
			//driver.findElement(By.id("checkout")).click();
			System.out.println("Selected Item is Correct As===>>Sauce Labs Bike Light");
			driver.findElement(By.id("checkout")).click();
		}
	
		else
		{
			System.out.println("Slected Item Is Not Corrected");
		}
			//put your name last name and zipcode
		WebElement first_Name = driver.findElement(By.name("firstName"));
		WebElement last_Name = driver.findElement(By.name("lastName"));
		WebElement postal_Code = driver.findElement(By.name("postalCode"));
		WebElement continues = driver.findElement(By.name("continue"));
		first_Name.sendKeys("shreya");
		last_Name.sendKeys("Jain");
		postal_Code.sendKeys("458001");
		continues.click();
		
		
		WebElement finish = driver.findElement(By.id("finish"));
		finish.click();
		WebElement thankyou_Message = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
		if(thankyou_Message.getText().equals("Thank you for your order!"));
		{
			System.out.println("Thankyou_Message is Displayed....Logging out");
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(500);
			driver.findElement(By.id("logout_sidebar_link")).click();
		}
		
	}
		
	}