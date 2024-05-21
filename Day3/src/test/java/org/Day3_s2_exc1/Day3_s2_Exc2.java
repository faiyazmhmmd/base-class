package org.Day3_s2_exc1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day3_s2_Exc2 {

	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\maven\\maven work spsce\\Day3\\exc\\Book1.xlsx");
		
		FileInputStream stream=new FileInputStream(f);
		
		Workbook book=new XSSFWorkbook(stream);
		
		Sheet sheet = book.getSheet("course");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				CellType type = cell.getCellType();
				
				switch (type) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(cell)) {
						
						
					}
					
					break;

				default:
					break;
				}
				
				
				
			}
			
		}

	}

}
