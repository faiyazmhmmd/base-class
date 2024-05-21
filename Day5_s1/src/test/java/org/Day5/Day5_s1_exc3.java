package org.Day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day5_s1_exc3 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("D:\\maven\\maven work spsce\\Day5_s1\\exc\\fai.xlsx");
		 
		 
		 Workbook book=new XSSFWorkbook();
		 Sheet sheet = book.createSheet("hello");
		 Row row = sheet.createRow(0);
		 
		 Cell cell = row.createCell(2);
		 cell.setCellValue("API");
		 
		 
		 FileOutputStream out=new FileOutputStream(file);
		 
		 book.write(out);
		
		 
		 
		 

	}

}
