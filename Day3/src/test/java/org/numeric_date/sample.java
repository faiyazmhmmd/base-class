package org.numeric_date;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sample {

	public static void main(String[] args) throws IOException {
    
		File file=new File("D:\\maven\\maven work spsce\\Day3\\exc\\Book1.xlsx");
		
		FileInputStream stream=new FileInputStream(file);
		
		Workbook workbook=new XSSFWorkbook(stream);
		
		 Sheet sheet = workbook.getSheet("course");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	                Row row = sheet.getRow(i);
	                
	               
	                
	                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
	                	Cell cell = row.getCell(j);
	                	
	                	CellType Type = cell.getCellType();
	                	
	               switch (Type) {
						case STRING:
							String stringCellValue = cell.getStringCellValue();
							System.out.println(stringCellValue);
							
							break;
						case NUMERIC:
							
							if(DateUtil.isCellDateFormatted(cell)) {
							
								Date dateCellValue = cell.getDateCellValue(); 
								SimpleDateFormat dateforamt=new SimpleDateFormat("dd-MMM-YY");
								String format = dateforamt.format(dateCellValue);
								System.out.println(format);
								}
							else {
								double d = cell.getNumericCellValue();
								
								BigDecimal b=BigDecimal.valueOf(d);
								
								String string = b.toString();
								System.out.println(string);
							}

						default:
							break;
						}
	                	}
}
}
}