import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Sheet_Handling {
	
	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		
		//String  path = "E:/Setup/Studen_Data.xlsx";
		File  file = new File("E:/Setup/Studen_Data.xlsx");
		//FileInputStream f = new FileInputStream(path);
				FileInputStream f = new FileInputStream(file);
//	    for(int i=0;i<3;i++) {
//	    	for(int j=0;j<3;j++) {
//	    	String name=	WorkbookFactory.create(f).getSheet("Brothers").getRow(i).getCell(j).getStringCellValue();
//	    	  System.out.println("Name of Brothers is "+name);
//	    	}
//	    }
		String name=	WorkbookFactory.create(f).getSheet("Brothers").getRow(0).getCell(0).getStringCellValue();
	   System.out.println("Name of Brothers is "+name);
     String name_1=	WorkbookFactory.create(f).getSheet("Brothers").getRow(0).getCell(1).getStringCellValue();
	   System.out.println("Name of Brothers is "+name_1);
	 //  Xls_Reader reader = new Xls_Reader("E:/Setup/Studen_Data.xlsx")
	   XSSFWorkbook w =  new XSSFWorkbook(f);
	   XSSFSheet sheet = w.getSheet("Brothers");
	   int row_count = sheet.getLastRowNum();
	   System.out.println(row_count);
	   
	   
	}

}
