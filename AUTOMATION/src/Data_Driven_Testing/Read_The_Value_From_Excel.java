package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_The_Value_From_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path="./Data/testscript.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("invalid Login").getRow(2).getCell(1).getStringCellValue();	
		System.out.println(data);
	
	}

}
