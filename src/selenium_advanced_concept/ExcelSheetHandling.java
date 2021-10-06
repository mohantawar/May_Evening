package selenium_advanced_concept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetHandling {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "E:\\Setup\\Data\\Country_Capital.xlsx";
		// FileInputStream file = new FileInputStream(path);
		// String name=
		// WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		// System.out.println(name);

		// String name1=
		// WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		FileInputStream file1 = new FileInputStream(path);
		int row1 = WorkbookFactory.create(file1).getSheet("Sheet1").getLastRowNum();
		System.out.println(row1);
		// System.out.println(name1);
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 2; j++) {
				FileInputStream file = new FileInputStream(path);
				String name = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(name);
				System.out.print(" | ");
			}
			System.out.println();
		}

		for (int row = 4; row <= 6; row++) {

			for (int col = 0; col <= 2; col++) {
				FileInputStream file = new FileInputStream(path);
				double values = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(col)
						.getNumericCellValue();
				System.out.print(values);
				System.out.print(" | ");
			}
			System.out.println();
		}
	}

}
