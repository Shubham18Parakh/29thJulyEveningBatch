package screenshotuse;


import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreensotStudy {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.triveniturbines.com/");
		Thread.sleep(1000);
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(Source);
		
	File dest =new File("C:\\Users\\user\\Documents\\Desktop\\myscreenshot.png");
	
		FileHandler.copy(Source, dest);
		

	}

}
