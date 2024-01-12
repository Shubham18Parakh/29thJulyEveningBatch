package synchronization_wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Impliciit_Wait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://upstox.com/");
		//Thread.sleep(10000); //31sec
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); //25sec

	}

}
