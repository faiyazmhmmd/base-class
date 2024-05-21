package org.Day3_s2_exc1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day3_s2_ex1 {

	private static final CellStyle STRING = null;

	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\maven\\maven work spsce\\Day3\\exc\\Book1.xlsx");
		
		FileInputStream stream=new FileInputStream(f);
		
		Workbook book=new XSSFWorkbook(stream);
		
		Sheet sheet = book.getSheet("course2");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
		     Row row = sheet.getRow(i);
	
			
			Cell cell = row.getCell(0);
			
			CellType Type = cell.getCellType();
			
			switch (Type) {
			
			case STRING:
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				
			case NUMERIC:
				if(DateUtil.isCellDateFormatted(cell)) {
					
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateformat=new SimpleDateFormat("dd-MMM-YYYY");
					String format = dateformat.format(dateCellValue);
					System.out.println(format);
					}
				else {
                  
					double numericCellValue = cell.getNumericCellValue();
					
					long round = Math.round(numericCellValue);
					
					if(round==numericCellValue) {
						
						String valueOf = String.valueOf(round);
						 System.out.println(valueOf);
					}
					else {
						String valueOf = String.valueOf(numericCellValue);
						
						System.out.println(valueOf);
						
					}
				}
				
				break;

			default:
				break;
			}
			
				
			
			
			
			
		}
		
		
		

	}

}
