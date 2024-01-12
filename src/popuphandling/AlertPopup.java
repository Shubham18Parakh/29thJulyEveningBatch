package popuphandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		//Handling Alert Popup
				//Changing selenium  focus from mainpage to Alert popup
				Alert alt = driver.switchTo().alert();
				//if i want to click on ok button on alert use accept method
				//alt.accept();
				alt.dismiss();//click on cancle button
				Thread.sleep(1000);
		driver.findElement(By.name("res")).click();
		driver.findElement(By.name("cusid")).sendKeys("123abc");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		//using gettext on alert popup
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();//click on ok button
		Thread.sleep(2000);
		 	Alert alt1 = driver.switchTo().alert();
		alt1.accept();
	}

}
