package org.Day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sample3 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("D:\\maven\\maven work spsce\\Day3\\exc\\Book1.xlsx");
		
		FileInputStream stream=new FileInputStream(file);
		
		Workbook workbook=new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("course");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	                Row row = sheet.getRow(i);
	                
	                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
	                	Cell cell = row.getCell(j);
	                	
	                	CellType type = cell.getCellType();
	                	//System.out.println(type);
	                	
	                	switch (type) {
						case STRING:
							String cellValue = cell.getStringCellValue();
							System.out.println(cellValue);
							
							break;
						case NUMERIC:
							// 0
							double cellValue2 = cell.getNumericCellValue();
							BigDecimal bigDecimal = BigDecimal.valueOf(cellValue2);
							String string = bigDecimal.toString();
							System.out.println(string );
						default:
							break;
//the drawback is in excel data-si.nu: 1,2,3,4,5 but in console is 1.0,2.0,3.0...
						}
						
					}
		}
		

	}

}
