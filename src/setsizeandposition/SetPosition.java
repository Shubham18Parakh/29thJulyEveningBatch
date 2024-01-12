package setsizeandposition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.trivenigroup.com/");
		Thread.sleep(1000);
		Point defaultPosition = driver.manage().window().getPosition();
		System.out.println(defaultPosition);
		
		Point p = new Point(30, 10);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p);
		
		Point p1 = new Point(100, 40);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p1);
		
		System.out.println(p);
		System.out.println(p1);


	}

}
