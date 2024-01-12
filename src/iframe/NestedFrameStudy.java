package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameStudy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		//Switch Focus From Main page to Iframe
		driver.switchTo().frame("singleframe");
		String Mytext = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
		System.out.println("My text is =" + Mytext);
		
		//Switch Selenium Focus From Iframe to main page
		driver.switchTo().defaultContent();
		boolean Button2 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).isDisplayed();
		 System.out.println("Display status is " + Button2);
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		//We Are On Main Page---->>Need to Switch Focus From Main Page To OuterFrame
		int Total_Frame = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames Are "+ Total_Frame );
		Thread.sleep(1000);
		
		driver.switchTo().frame(1); //OUTER FRAME
       driver.switchTo().frame(0); // INNER FRAME
        
		WebElement Frame = driver.findElement(By.xpath("//input[@type='text']"));
		Frame.sendKeys("Shubham");
		Thread.sleep(1000);
		Frame.clear();
		
		//Child Frame to Immidiate parent
		driver.switchTo().parentFrame();
		
		String MyText1 = driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
		System.out.println("My Text1 is " +MyText1);
		
		//Child Frame To Main page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Register")).click();
		
	}

}
