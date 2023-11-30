package Handling_Excel_File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Handling_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path="./Data/testscript.xlxs.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("Create Customer").getRow(2).getCell(1).getStringCellValue();
		System.out.println(data);
		
	}

}
