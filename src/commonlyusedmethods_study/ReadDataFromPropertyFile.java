package commonlyusedmethods_study;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {


		
		public static String readDataFromPropertyClass(String key) throws IOException 
		{
		       // Create Object Of Property class
				Properties prop = new Properties();
				//File location
				//Create Obj of FileinputStream
				//FileInputStream MyFile = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\seleniumshubham\\CoverFoxData.properties");
		         //load file
				
				FileInputStream MyFile = new FileInputStream(System.getProperty("user.dir")+ "\\CoverFoxData.properties");
				 prop.load(MyFile);
				 //pass the key for the data we want
				 String value = prop.getProperty(key);
			     // System.out.println(value);
				return value;
			      
			      
		
		}
		

	}


