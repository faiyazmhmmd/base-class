package org.Day2_s1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exc5 {

	public static void main(String[] args) throws IOException {
File f=new File("D:\\maven\\maven work spsce\\Excel_day2_s1\\Exel\\Excel task1.xlsx");
		
		FileInputStream stream=new FileInputStream(f);
		
		Workbook workbook=new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Course");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			//9 row are there
			Row row = sheet.getRow(i);
			//System.out.println(row);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				//3 cell is there
				Cell cell = row.getCell(j);
				System.out.println(cell);
 
				
		//getphysicalnumberofrows=9  getphysicalnumberofcolum=3 
/*i=0  0<9 row(0) j=0 0<3 cell(0) "Name"   j=0+1=1
 *                j=1 1<3 cell(1) "count"  j=1+1=2
 *                j=2 2<3 cell(2) "fees"   j=2+1=3
 *                j=3 3<3 loopend                   i=0+1
 *i=1 1<9 row(1)  j=0 0<3 cell(0) "faiyaz" j=0+1=1
 *                j=1 1<3 cell(1) "java"   j=1+1=2
 *                j=2 2<3 cell(2) "2000"   j=2+1=3  
 *                j=3 3<3 loopend                   i=1+1=2
 *i=2.................
 
				 */
				
			}
			
		}

	}

}
