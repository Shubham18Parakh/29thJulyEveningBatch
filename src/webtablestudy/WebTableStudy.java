package webtablestudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableStudy {

	public static void main(String[] args) {
		//Identifying webtable
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement bookTable = driver.findElement(By.name("BookTable"));
		//System.out.println(bookTable);
		
		//how many rows in table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
         int totalNumOfRows = rows.size();
         System.out.println("Number of rows in the table = " + totalNumOfRows);
         
       //how many rows in table
     List<WebElement> Header = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
         
        int numberOfColumns = Header.size();
        System.out.println("Number Of Columns In the Table ="+numberOfColumns);
        
      
        
       List<WebElement> tableData = driver.findElements(By.xpath("//table[@name='BookTable']//tr/td"));
      int allTableData = tableData.size();
       System.out.println("All Table Data="+allTableData  );
       
    System.out.println("__________________________________");
       
	   for( WebElement tD:tableData)
       {
    	   System.out.print(tD.getText()+ "  ");
       }
      
	   
	}

}
