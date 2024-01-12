package webdriverstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
    //ASSIGNMENET VERIFY VELOCITY URL
	public static void main(String[] args) throws InterruptedException {
		String Expected_Result = "https://vctcpune.com/";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(2000);
		
		 String url=driver.getCurrentUrl();
		 System.out.println("Url is " + url );
		 
		 if(Expected_Result.equals(url))
		 {
			System.out.println("BOTH URL IS MATCHED SO TEST CASE PASSED"); 
			 
		 }
		 else {
			 System.out.println("BOTH URL IS NOT MATCHED SO TEST CASE FAILLED");
		 }
	
		 //driver.close();

	}

	
}
