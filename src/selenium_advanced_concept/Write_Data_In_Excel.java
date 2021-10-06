package selenium_advanced_concept;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data_In_Excel {
	
	public static void main(String[]args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("DS_Student");
		 Object student_data [][] = {   {"Name","Mis","Company"},
				                       {"Vikas","121933002","Whirlpool"},
				                       {"Swapnil","121933011","Chipsprit"},
				                       {"Prasad","121933016","Whirlpool"},
				 
		                        }; 
		 
		 int rows = student_data.length;
		 int cols = student_data[0].length;
		 
		 System.out.println(rows);
		 System.out.println(cols);
		 
		 for(int r =0;r<rows;r++) 
		 {
			 
			XSSFRow row = sheet.createRow(r);
			 for(int c=0;c<cols;c++) 
			 {
				   XSSFCell cell=row.createCell(c);
				Object value= student_data[r][c];
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			 }
		 }
		 
		/* int rowCount=0;
		 for(Object boys[]:student_data) {
			 XSSFRow row = sheet.createRow(rowCount++);
			 int colomnCount = 0;
			 for(Object value:boys) {
				  XSSFCell cell= row.createCell(colomnCount++);
				  
				  if(value instanceof String)
						cell.setCellValue((String)value);
				  if(value instanceof Integer)
						cell.setCellValue((Integer)value);
				  if(value instanceof Boolean)
						cell.setCellValue((Boolean)value);
				 
			 }
			 
		 }*/
		 
		/* ArrayList<Object[]>student_data = new ArrayList<Object[]>();
		 student_data.add(new Object[]  {"Name","Mis","Company"});
		 student_data.add(new Object[] {"Vikas","121933002","Whirlpool"} );
		 student_data.add(new Object[]  {"Swapnil","121933011","Chipsprit"});
		 student_data.add(new Object[]  {"Prasad","121933016","Whirlpool"});
		 
		 int row_no =0;
		 for(Object[] boys:student_data) {
			 XSSFRow row = sheet.createRow(row_no++);
			 int cell_no = 0;
			 for(Object value:boys) {
				 XSSFCell cell = row.createCell(cell_no++);
				 
				 if(value instanceof String)
						cell.setCellValue((String)value);
				  if(value instanceof Integer)
						cell.setCellValue((Integer)value);
				  if(value instanceof Boolean)
						cell.setCellValue((Boolean)value);
				 
			 }
			 
		 }*/
		 
		 
		 String path ="E:\\Setup\\Data\\Mtech4.xlsx";
		 FileOutputStream outstream = new FileOutputStream(path);
		 workbook.write(outstream);
		 
		 outstream.close();
		 
		 System.out.println("MTech xlsx file is written successfully");
				 
				 
				 
				 
				 
	}
	        

}
