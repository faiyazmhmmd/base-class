package org.Day2_task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day2_task1 {

	public static void main(String[] args) throws IOException {
		
		File f= new File("D:\\maven\\maven work spsce\\Day2_task\\Exc\\Book1.xlsx");
		
		FileInputStream file=new FileInputStream(f);
		
		Workbook exc=new XSSFWorkbook(file);
		 
		
		Sheet sheet = exc.getSheet("task1");
		
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of row:"+numberOfRows);
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				System.out.println(cell);
			
				
			}
			
			}
		
		

	}

}
