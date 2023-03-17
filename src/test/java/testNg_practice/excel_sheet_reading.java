package testNg_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_sheet_reading {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\AjitKumarSingh\\eclipse-workspace\\AutomationWithSelenium\\src\\test\\java\\data\\excelData.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		// XSSFSheet sheet= book.getSheet(null);
		int rows = sheet.getLastRowNum();
		System.out.println("Total Row  "+rows);
		int cols = sheet.getRow(1).getLastCellNum();
		System.out.println("Total Coloum  "+cols);
		
		for(int r =0;r<=rows;r++) {
			XSSFRow row = sheet.getRow(r);
			for(int c =0;c<cols;c++) {
				
				XSSFCell cel = row.getCell(c);
				
				switch(cel.getCellType()) {
				
				case STRING:
					System.out.print(cel.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cel.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cel.getBooleanCellValue());
					break;
				
				
				}
				
				System.out.print(" || ");
			}
			
			System.out.println(" ");
		}
		
	}

}
