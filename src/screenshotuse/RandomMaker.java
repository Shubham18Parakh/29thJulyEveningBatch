package screenshotuse;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class RandomMaker {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/sports/cricket?filters=sport_type%3Dcricket");
		Thread.sleep(1000);
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		RandomString rs= new RandomString();
		System.out.println(RandomString.make(3));
		File dest=new File("D:\\picture\\myscreenshots\\myscreenshots"+ rs+ ".png");
		FileHandler.copy(Source, dest);
		
		

	}

}
