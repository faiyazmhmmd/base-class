package org.Day2_s1;

    import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;


	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
	public class Exc3 {
	

		public static void main(String[] args) throws IOException {
	
			File f=new File("D:\\maven\\maven work spsce\\Excel_day2_s1\\Exel\\Excel task1.xlsx");
			
			FileInputStream stream=new FileInputStream(f);
			
			Workbook workbook=new XSSFWorkbook(stream);
			
			Sheet sheet = workbook.getSheet("Course");
			
			
			//to count the number of row present in a sheet
			
			
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			System.out.println(physicalNumberOfRows);
			

}
}