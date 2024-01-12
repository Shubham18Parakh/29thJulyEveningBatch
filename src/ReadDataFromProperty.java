import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		// Create Object Of Property
		
		Properties prop = new Properties();
		
		//Create Obj of FileinputStream
		
		FileInputStream MyFile = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\seleniumshubham\\CoverFoxData.properties");
		
        prop.load(MyFile);
       String value1 = prop.getProperty("age");
       System.out.println(value1);
       String value2 = prop.getProperty("pincode");
       System.out.println(value2);
       String value3 = prop.getProperty("mobilenumber");
       System.out.println(value3);
       
        
        




	}

}
