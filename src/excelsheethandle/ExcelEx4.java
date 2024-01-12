package excelsheethandle;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myfile= new FileInputStream("D:\\Book1.xlsx");
		Workbook myworkbook = WorkbookFactory.create(myfile);
		Sheet mySheet = myworkbook.getSheet("Sheet2");
		int totalNumOfRows = mySheet.getLastRowNum();
		System.out.println(totalNumOfRows);
		
		System.out.println("===================================");
		
		short lastCellNum = mySheet.getRow(totalNumOfRows).getLastCellNum();
		System.out.println(lastCellNum);
		System.out.println("==================================");
		
		int  totalNumOfCells= lastCellNum-2;
		System.out.println(totalNumOfCells);
		System.out.println("==================================");
		System.out.println(mySheet.getRow(1).getCell(3).getCellType());

	}

}
