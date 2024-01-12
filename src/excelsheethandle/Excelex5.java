package excelsheethandle;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelex5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myfile= new FileInputStream("D:\\Book1.xlsx");
		Workbook myworkbook = WorkbookFactory.create(myfile);
		Sheet mySheet = myworkbook.getSheet("Sheet2");
		int totalNumOfRows = mySheet.getLastRowNum();
		System.out.println(totalNumOfRows);
		System.out.println("================================");
		short lastCellNum = mySheet.getRow(totalNumOfRows).getLastCellNum();
		System.out.println(lastCellNum);
		int  totalNumOfCells= lastCellNum-2;
		
		for(int i=0;i<=totalNumOfRows; i++) 
		{
			//inner
			for(int j=0; j<=totalNumOfCells; j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
		
		

	}

}
