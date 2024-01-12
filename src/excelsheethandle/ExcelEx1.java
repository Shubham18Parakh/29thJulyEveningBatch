package excelsheethandle;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelEx1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
		FileInputStream myfile = new FileInputStream("D:\\Book1.xlsx");
	Workbook myworkbook = WorkbookFactory.create(myfile);

	Sheet mysheet = myworkbook.getSheet("Sheet1");
	Row myRow = mysheet.getRow(0);
	Cell myCell = myRow.getCell(0);
	System.out.println("Value From Excel Sheet Is = "  + myRow.getCell(0).getStringCellValue());
	CellType myDataType = myCell.getCellType();
	System.out.println(myDataType);

	}

}
