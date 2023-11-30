package Data_Driven_Testing;//Getting NullPointer Exception

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class To_Check_ReturnType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path="./Data/testscript.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("invalid Login");
		Row r = s.getRow(1);
		Cell c = r.getCell(1);
		String data = c.getStringCellValue();
		System.out.println(data);
	}

}
