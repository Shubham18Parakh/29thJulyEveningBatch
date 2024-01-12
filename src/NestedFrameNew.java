import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFrameNew {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(2000);
	 String MyPageText1 = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
		System.out.println("Text On Main Page1 = "  +  MyPageText1);
		
		driver.switchTo().frame("frame1");
		//Swiching Selenium Focus From MainPage To Frame1(main page to outer)
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium Practice");
		Thread.sleep(1000);
		//Switching Focus From Outerframe to Inner Frame
		driver.switchTo().frame("frame3");
		//Clicking Check Box
		Thread.sleep(1000);
		driver.findElement(By.id("a")).click();
		//Clearing Text From Parent Frame(Outer)Text box
		
         driver.switchTo().parentFrame();
         Thread.sleep(500);
         driver.findElement(By.xpath("//input[@type='text']")).clear();
         //Want To Handle DropDown From Another Frame
         //We Need To Change Selenium Focus Outer From Main Page---->>>>Then Main To Another Frame
         
         driver.switchTo().defaultContent();
         driver.switchTo().frame("frame2");
         Thread.sleep(500);
         WebElement AnimalsDropDown = driver.findElement(By.id("animals"));
         Select s = new Select(AnimalsDropDown);
         s.selectByIndex(2);
         System.out.println(s.getFirstSelectedOption().getText());
         driver.switchTo().defaultContent();
         //Getting Text From Main Page
         Thread.sleep(500);
         String MyPageText2 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
     	System.out.println("Text On Main Page2 = "  +  MyPageText2);
         
	}

}
