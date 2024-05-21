package org.Day2_s1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day2_s1 {

	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\maven\\maven work spsce\\Excel_day2_s1\\Exel\\Excel task1.xlsx");
		
		FileInputStream stream=new FileInputStream(f);
		
		Workbook workbook=new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Course");
		
		//row is index based
		Row row = sheet.getRow(4);
		
		//cell is index based
		Cell cell = row.getCell(1);
		System.out.println(cell);
		

	}

}
