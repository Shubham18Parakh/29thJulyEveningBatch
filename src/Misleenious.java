import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;


public class Misleenious {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(2000);
		List<WebElement> SearchResult = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));	
	
for(WebElement sr:SearchResult)
{
	System.out.println(sr.getText());
}
System.out.println("==================================================================");
Thread.sleep(2000);
  String ExpectedResult = "honda elevate";
  
for(WebElement sr1:SearchResult)
{
   String ActualResult = sr1.getText();
  
   
   if(ActualResult.equals(ExpectedResult))
   {
	   sr1.click();
	   System.out.println(ActualResult);
	    break;
   }
  
}
Thread.sleep(2000);
driver.findElement(By.linkText("Images")).click();
File Honda = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

System.out.println(Honda);
RandomString rs=new RandomString();
System.out.println(RandomString.make(3));
File dest=new File("D:\\picture\\myscreenshots\\myscreenshots"+rs+".png");

FileHandler.copy(Honda, dest);
	}

}
