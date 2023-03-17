package testNg_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_reader {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\AjitKumarSingh\\eclipse-workspace\\AutomationWithSelenium\\src\\test\\java\\data\\excelbook2.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		System.out.println("now of row" + " " + rows);
		int cols = sheet.getRow(1).getLastCellNum();
		System.out.println("now of col" + " " + cols);
		for (int r = 0; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < cols; c++) {
				XSSFCell cel = row.getCell(c);
				switch (cel.getCellType()) {
				case STRING:
					System.out.println(cel.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println(cel.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.println(cel.getBooleanCellValue());
					break;

				}
				// System.out.print("||");

			}
			
			System.out.println(" ");
			

		}

	}

}
