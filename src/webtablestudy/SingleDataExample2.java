package webtablestudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleDataExample2 {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
//how to read table header 
WebElement singleHeader = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[3]"));
System.out.println(singleHeader.getText());
System.out.println("==================");
List<WebElement> headers = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
//System.out.println(headers);

for(WebElement th:headers)
{
	System.out.print(th.getText() + " ");
}
System.out.println();
System.out.println("===========================");

//only one data from table
WebElement singleData = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[3]"));
System.out.println(singleData.getText());

System.out.println("===========================");

//how to read complete row

   List<WebElement> row4 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[4]/td"));
   for(WebElement r:row4)
   {
	   System.out.print(r.getText()+ " ");
   }
   System.out.println();
   
   System.out.println("=====================================");

//how to read complte all column
for(int i=2; i<=7; i++)
{
	 WebElement column = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]"));
	 System.out.println(column.getText());
}

}
}