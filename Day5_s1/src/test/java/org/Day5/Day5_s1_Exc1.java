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

public class Day5_s1_Exc1 {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\maven\\maven work spsce\\Day5_s1\\exc\\Book1.xlsx");
		 
		 FileInputStream steam=new FileInputStream(file);
		 
		 Workbook book=new XSSFWorkbook(steam);
		 
		 Sheet sheet = book.getSheet("course");
		 
		 Row row = sheet.getRow(0);
		
		 // if cell is empty creat the cell
		//insert the value
		 
		 Cell cell = row.createCell(10);
		 
		 //there is no need of verify because cell is emptys
		 
		 //in order to enter the value in cell use setcellvalue method
		 cell.setCellValue("empty cell");
		 
		 
		 FileOutputStream out=new FileOutputStream(file);
		 
		 book.write(out);
		 

	}

}
