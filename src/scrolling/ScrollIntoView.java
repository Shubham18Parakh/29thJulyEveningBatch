package scrolling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trivenigroup.com/");
		Thread.sleep(1000);
		WebElement businesses = driver.findElement(By.xpath("//h2[text()='BUSINESSES']"));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",businesses);
		Thread.sleep(2000);
		WebElement milestones = driver.findElement(By.xpath("//h2[text()='MILESTONES']"));
		js.executeScript("arguments[0].scrollIntoView();",milestones);
		
		File src = milestones.getScreenshotAs(OutputType.FILE);
		//System.out.println(src);
		File dest = new File("D:\\MyScreenshot\\milesstone.png");
		FileHandler.copy(src, dest);
		
	

	}

}
