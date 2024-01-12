package commonlyusedmethods_study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestingByFatching {
	
	public static String readexcelsheet( String sheet,int row , int cell) throws EncryptedDocumentException, IOException
	{
//		FileInputStream file = new FileInputStream("‪‪‪‪‪C:\\Users\\user\\Documents\\Desktop\\Exceldata\\newfile.xlsx");
//		
//		Sheet Mysheet = WorkbookFactory.create(file).getSheet("Sheet1");
//	String Value = Mysheet.getRow(row).getCell(cell).getStringCellValue();
//	return Value;
//		
	FileInputStream file = new FileInputStream("C:\\Users\\user\\Documents\\Desktop\\coverfoxdatastore.xlsx");
	
	Sheet mysheet = WorkbookFactory.create(file).getSheet("coverfoxdata");
	
	String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
	return value;
	
	}
	
	
	

}
