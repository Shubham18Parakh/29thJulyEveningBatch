package webtablestudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicExamples {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	int numberOfColumns = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();
	
	int numberOfRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
	for(int h=1; h<=numberOfColumns; h++)
	
		{
			String data = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/th["+h+"]")).getText();
			System.out.print(data + " ");
			
			
		}
		System.out.println();
	System.out.println("=========================================");	
	
	for(int i=1; i<=numberOfRows-1; i++) 
	{

		for(int j =1; j<=numberOfColumns; j++)
		{
			String data1 = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(data1 + " ");
		}
		System.out.println();
		System.out.println("=========================================================");
			
	}
		 
	}                  
		 
	} 
	


