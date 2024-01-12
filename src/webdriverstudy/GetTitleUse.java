package webdriverstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleUse {

	public static void main(String[] args) throws InterruptedException {
		
		String Expected_Webpage_Title_Result="Title is The Board of Control for Cricket in India"; 
    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bcci.tv/");
		
		Thread.sleep(1000);
		
		String Actual_Title = driver.getTitle();
		System.out.println("Title is " + Actual_Title );
	if(Expected_Webpage_Title_Result.equals(Actual_Title))
	{
		System.out.println("Title is Matching and Test Case Is Passed ");
	}
	else {
			System.out.println("Title is not Matching so Test Case Failled ");
		}
	Thread.sleep(500);
	driver.close();
	}

}
