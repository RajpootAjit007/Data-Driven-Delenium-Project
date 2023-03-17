package testNg_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\AjitKumarSingh\\eclipse-workspace\\AutomationWithSelenium\\src\\test\\java\\data\\excelData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("loginTest");
		//XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		
		
		System.out.println(row.getCell(0));
	}

}
