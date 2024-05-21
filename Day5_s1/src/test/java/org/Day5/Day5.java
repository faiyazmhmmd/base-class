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

public class Day5 {

	//program to replace the data in excel sheet by automation
	
	public static void main(String[] args) throws IOException {
		 File file=new File("D:\\maven\\maven work spsce\\Day5_s1\\exc\\Book1.xlsx");
		 
		 FileInputStream steam=new FileInputStream(file);
		 
		 Workbook book=new XSSFWorkbook(steam);
		 
		 Sheet sheet = book.getSheet("course");
		 //identify the rownum and columnum
		 Row row = sheet.getRow(9);
		 
		 Cell cell = row.getCell(3);
		 
		 //get the text value from cell
		 String CellValue = cell.getStringCellValue();
		 
		 //verify the data is equal to text in excel(male)
		 if(CellValue.equals("male")) {
			 
			 cell.setCellValue("female");
			 
		 }
		 
		 //convert object to file---->FileOutputStream--->save
		 //to save as----> FileOutputStream(creat new file and location)
		 FileOutputStream out=new FileOutputStream(file);
		 
		 //in order to type excel you have to write
		 book.write(out);
		 

	}

}
