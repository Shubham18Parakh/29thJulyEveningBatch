package popuphandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserstudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		//getting text on main page
		WebElement textOnMainPageElement = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
		textOnMainPageElement.getText();
		System.out.println("Main PageText1 = " +textOnMainPageElement.getText());
		//Clicking on new window button
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		//driver.close(); selenium will consider that we are on main page so it will close mainpage only child remain open
		//driver.quit(); all will close
		//Now we want to work on child window first maximize and and then type some text on available field
		//driver.findElement(By.id("the7-search")).sendKeys("Jai Jinendra");
		//your element inside child and you are searching it on mainpage so you will get NoSuchElementException
		//To switch to child window we should know the id of child window
		
		String mainPageId = driver.getWindowHandle();
		System.out.println("Main Page Id = " + mainPageId);
		//Use getwindowsHandles() method the get all pages id
		Set<String> allWindowId = driver.getWindowHandles();
		Iterator<String> it = allWindowId.iterator();
	String mainPageid=it.next();//getting id of main page
	String child1Id=it.next();//getting id of child1
	System.out.println("Mainpage Id is = " + mainPageid );
	System.out.println("child-1 Id is = " + child1Id );
	
	//Switching focus from mainpage to child window
	driver.switchTo().window(child1Id);
	Thread.sleep(2000);
	driver.manage().window().maximize();//will maximize child window
	driver.findElement(By.id("the7-search")).sendKeys("Jai Jinendra");
	//driver.findElement(By.xpath("//h1[text()='About me']")).getText();
	//driver.close(); here NOsuchwindow exception will come 
		System.out.println(driver.findElement(By.xpath("//h1[text()='About me']")).getText());
		//Again to work on main page--->>we need to switch focus from child window to main page
				driver.switchTo().window(mainPageid);
				Thread.sleep(500);
	String mainPageText2 = driver.findElement(By.xpath("//p[contains(text(),'browser window')]")).getText();	
		System.out.println("Main PageText2 = " + mainPageText2);
		//NoSuchElementException if you are not switching focus you want to work on then exception will come
		
	 	}

}
