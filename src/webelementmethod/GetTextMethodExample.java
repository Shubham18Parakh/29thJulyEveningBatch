package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethodExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bcci.tv/");
		Thread.sleep(700);
		String Expected_Result="Latest News";
		String Actual_Result=driver.findElement(By.className("text-black")).getText();
		System.out.println("My Actual Text Is =" + Actual_Result);
		
		if(Expected_Result.equals(Actual_Result)) 
		{
			System.out.println("Text is Maching so Test Cases passed");
		}
		else {
			System.out.println("Text is not Maching so Test Cases failled");
		}
		

	}

}
