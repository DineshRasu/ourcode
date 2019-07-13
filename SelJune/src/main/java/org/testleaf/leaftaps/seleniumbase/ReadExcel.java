package org.testleaf.leaftaps.seleniumbase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public void readExcelData() throws IOException {
		
		//Go to file location and open the file
		
		XSSFWorkbook wBook = new XSSFWorkbook("./Data/Test Data.xlsx");
		
		//Navigate to the particular sheet
		
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		
		//find the no. of rows and columns
		
		int rowCount = sheet.getLastRowNum();
		
		int cellCount = sheet.getRow(0).getLastCellNum();
		
		for(int i=1;i<=rowCount;i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<cellCount;j++) {
				
				XSSFCell cell = row.getCell(j);
				
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
					
		}
	}
	
}
