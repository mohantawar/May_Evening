package selenium_advanced_concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetHandling1 {
	
	public static void main(String[]args) throws IOException {
		File file1 = new File("E:/Setup/Data/Country_Capital.xlsx");
		//String path = "E:/Setup/Data/Country_Capital.xlsx";
		FileInputStream file = new FileInputStream(file1);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		//XSSFSheet sheet = new XSSFSheet(workbook);
	   
	  XSSFSheet sheet = workbook.getSheetAt(0);// XSSFSheet sheet = workbook.getSheet("Sheet1");
	   
	   // using for loop 
	   
	   int rows = sheet.getLastRowNum();// last row no
       int col= sheet.getRow(1).getLastCellNum();
       System.out.println(rows);
       System.out.println(col);
       
       for(int r =0;r<rows;r++)
       {
    	    XSSFRow  row= sheet.getRow(r);//1st row
    	    
    	   for(int c=0;c<col;c++) 
    	   {
    		  XSSFCell cell = row.getCell(c);
    		  
    		   switch(cell.getCellType())
    		   {
    		   case STRING: System.out.print(cell.getStringCellValue());break;
    		   case NUMERIC: System.out.print(cell.getNumericCellValue());break;
    		   case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
    		  
    		   }
    		   System.out.print(" | ") ;
    		  
    	   }
    	   System.out.println() ;
       }
	  
	}
	

}
