package setsizeandposition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.trivenigroup.com/");
		Thread.sleep(1000);
		Dimension defaultSize = driver.manage().window().getSize();
		System.out.println(defaultSize); //(1050, 708)
		Dimension d = new Dimension(500, 100);
		Thread.sleep(1000);
		driver.manage().window().setSize(d);
		Dimension d1 = new Dimension(200, 300);
		Thread.sleep(1000);
		driver.manage().window().setSize(d1);
		Dimension d2 = new Dimension(100, 50);
		Thread.sleep(1000);
		driver.manage().window().setSize(d2);
		
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		
	}

}
