package commonlyusedmethods_study;
import java.io.IOException;

import commonlyusedmethods_study.ReadDataFromPropertyFile;

public class TestingDataProperty {

	public static void main(String[] args) throws IOException 
	{
	
		
String value1 = ReadDataFromPropertyFile.readDataFromPropertyClass("age");
System.out.println(value1);
String value2 = ReadDataFromPropertyFile.readDataFromPropertyClass("pincode");
System.out.println(value2);
String value3 = ReadDataFromPropertyFile.readDataFromPropertyClass("mobilenumber");
System.out.println(value3);

//	String path = System.getProperty("user.dir" + "\\CoverFoxData.properties");
//	System.out.println(path);
	

	}

}
