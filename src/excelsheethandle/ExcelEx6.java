package excelsheethandle;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream myFile= new FileInputStream("D:\\Book1.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet3");
		//System.out.println(	mySheet.getRow(1).getCell(2).getCellType());
		
		int lastRowNum = mySheet.getLastRowNum();
		System.out.println(lastRowNum);
		int totalNumOfRows=lastRowNum;
		System.out.println("=============================");
	short lastCellNum = mySheet.getRow(0).getLastCellNum(); 
	System.out.println(lastCellNum);
	System.out.println("=============================");
	int totalNumOfCell = lastCellNum-1;
	System.out.println(totalNumOfCell);
	
	
	//outer for loop --->>>>>row
	for(int i=0; i<=totalNumOfRows; i++)
	{
		//inner for loop--->>>>>cells
		for (int j=0; j<=totalNumOfCell; j++)
		{
			CellType myDataTypeCell = mySheet.getRow(i).getCell(j).getCellType();
			System.out.print(myDataTypeCell + " " );
			
			if(myDataTypeCell==CellType.STRING) 
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value + " ");
				
			}
			else if (myDataTypeCell==CellType.NUMERIC)
			{
			double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
			System.out.print(value + " ");
			
			}
			else if (myDataTypeCell==CellType.BOOLEAN)
			{
			boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
			System.out.print(value + " ");
			}
			System.out.println();
		
		}
	
	}
	
	}

}
