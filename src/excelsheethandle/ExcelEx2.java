package excelsheethandle;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream myfile=new FileInputStream("D:\\Book1.xlsx");
		Workbook myworkbook = WorkbookFactory.create(myfile);
		Sheet mySheet = myworkbook.getSheet("Sheet1");
		
		for(int i=0; i<=2; i++)
		{
			String value = mySheet.getRow(0).getCell(i).getStringCellValue(); //0..1..2
			System.out.println(value);
		}
		System.out.println(mySheet.getRow(0).getCell(2).getCellType());
		

	}

}
