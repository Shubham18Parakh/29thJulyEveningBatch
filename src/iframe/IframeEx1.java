package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEx1 {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(3000);
//		String Mytest = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
//		System.out.println("My text is =" + Mytest);
		//Switching Focus from Main Page to Iframe
		driver.switchTo().frame("singleframe");
		String Mytext = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
		System.out.println("My text is =" + Mytext);
		driver.switchTo().defaultContent();
		boolean Button2 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).isDisplayed();
		
           System.out.println("Display status is " + Button2);
           
           
	}}


