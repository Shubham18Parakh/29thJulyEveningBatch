package commonlyusedmethods_study;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotcodeUse {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Test_1_Examle.takescreenshot(driver, "guru99");

	}

}
