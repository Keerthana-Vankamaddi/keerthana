package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UsingFirstDDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./src/test/resources/Keer.xlsx");
		Workbook work = WorkbookFactory.create(fis);
		Sheet sheet = work.getSheet("mysheet");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		Row row1 = sheet.getRow(0);
		Cell cell1 = row1.getCell(1);
		String value1 = cell1.getStringCellValue();
		System.out.println(value1);
		System.out.println(value+": "+value1);
	}

}
