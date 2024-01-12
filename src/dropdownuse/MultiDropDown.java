package dropdownuse;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		WebElement DROP_DOWN = driver.findElement(By.xpath("//select[@id='multiselect1']")); 
		Select s = new Select(DROP_DOWN);
		System.out.println(s.isMultiple());
		Thread.sleep(700);
		s.selectByVisibleText("Volvo");
		Thread.sleep(500);
		s.selectByValue("swiftx");
		Thread.sleep(500);
		s.selectByIndex(2);
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println("=========================================================");
		List<WebElement> options = s.getOptions();
		//System.out.println(options);
		System.out.println("=================================================");
		for(WebElement op:options) 
		{
			System.out.println(op.getText());
		}
		System.out.println("==============================================================");
    List<WebElement> selectedoptions = s.getAllSelectedOptions();
		//System.out.println(selectedoptions);
		System.out.println("=============================================================");
		for(WebElement so:selectedoptions) 
		{
			System.out.println(so.getText());
		}
		System.out.println("=========================ITERATOR=====================================");
	Iterator<WebElement> ito = options.iterator();
	while(ito.hasNext()) 
	{
		System.out.println(ito.next().getText());
	}
		System.out.println("====================================================================");
	
		ListIterator<WebElement> lit = options.listIterator();
		while(lit.hasNext()) 
		{
			System.out.println(lit.next().getText());
		}
		System.out.println("----------------------------backward---------------------------------------");
		while(lit.hasPrevious()) 
		{
			System.out.println(lit.previous().getText());
		}
		System.out.println("===============================for_loop======================");
	}

}
