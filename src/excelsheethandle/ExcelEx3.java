package excelsheethandle;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream myfile = new FileInputStream("D:\\Book1.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myfile);
		Sheet mySheet = myWorkBook.getSheet("Sheet2");
		//read whole excelsheet
		//System.out.println(mySheet.getRow(1).getCell(2).getStringCellValue());
		
		//outer for loop-row->>0>>1 variable=i
		for(int i=0; i<=1; i++) 
		{
			//inner for loop-cell->>0>>1>>2>>3
			for(int j=0; j<=3; j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(value + " ");
			}
			System.out.println();
		}
	
		System.out.println(mySheet.getRow(1).getCell(3).getCellType());
	}

}
