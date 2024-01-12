package chromeoptionsclassstudy;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsUse {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt= new ChromeOptions();
		//opt.addArguments("incognito");
		//opt.addArguments("--disable-notifications");
		//opt.addArguments("--disable-infobars");
		//opt.addArguments("version");
		//opt.addArguments("--headless");output result will be displayed only in console without opening web browser (gui/ui) 
		
		ArrayList<String> al=new ArrayList<>();
		//al.add("--headless");
		al.add("incognito");
		al.add("--disable-notifications");
		al.add("start-maximized");
		
		
		opt.addArguments("al");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		//opt.addArguments("start-Maximized");
		driver.get("https://www.justdial.com/");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
	

	}

}
