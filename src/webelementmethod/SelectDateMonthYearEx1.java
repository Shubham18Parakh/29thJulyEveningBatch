package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDateMonthYearEx1 {

	public static void main(String[] args) throws InterruptedException {
		
	//1.	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jainmilap.com/registration");
		Thread.sleep(1000);
	WebElement DATE = driver.findElement(By.id("dobDay"));
	Select sDATE=new Select(DATE);
		sDATE.selectByIndex(18);// For Particular This Site Its Not Counting the Index From Zero. Its Counting Index from 1 and giving same output 18 why?
		Thread.sleep(1000);
		WebElement Month = driver.findElement(By.name("dobMonth"));
		Select sMonth = new Select(Month);
		sMonth.selectByIndex(9);
		Thread.sleep(1000);
		WebElement Year = driver.findElement(By.id("dobYear"));
		Select sYear=new Select(Year);
		sYear.selectByVisibleText("2000");
//2.
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(1500);
		WebElement day = driver.findElement(By.id("day"));
		Select sday=new Select(day);
			sday.selectByIndex(17);
			Thread.sleep(1000);
			WebElement month = driver.findElement(By.name("birthday_month"));
			Select smonth= new Select(month);
			smonth.selectByValue("4");
			Thread.sleep(1000);
			WebElement year = driver.findElement(By.id("year"));
			Select syear = new Select(year);
			syear.selectByVisibleText("1996");
		boolean result=syear.isMultiple();
		System.out.println("year multiple selectable status =" + result);
		
		
		
		

	}

}
