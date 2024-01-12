package excelsheethandle;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelEx0 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\user\\Documents\\Desktop\\testcase new.xlsx");
		
		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(11).getCell(2).getStringCellValue();
		
		System.out.println("Value From Excel Sheet Is" + value);
	}

}

