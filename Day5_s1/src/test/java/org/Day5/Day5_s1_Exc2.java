package org.Day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day5_s1_Exc2 {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\maven\\maven work spsce\\Day5_s1\\exc\\Book1.xlsx");
		 
		 FileInputStream steam=new FileInputStream(file);
		 
		 Workbook book=new XSSFWorkbook(steam);
		 
		 Sheet sheet = book.getSheet("course");
		 
		 Row row = sheet.createRow(12);
		 
		 Cell cell = row.createCell(10);
		 
		 cell.setCellValue("empty cell and row");
		 
		 FileOutputStream out=new  FileOutputStream(file);
		 
		 book.write(out);
		 

	}

}
