package commonlyusedmethods_study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Test_1_Examle {

	public static void takescreenshot(WebDriver driver , String filename ) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\MyScreenshot\\"+filename+".png");
		FileHandler.copy(src, dest);
		
	}
	


}
