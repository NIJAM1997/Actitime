package Data_Driven_Testing;//Getting Nul Pointer Exception

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Multiple_Data_from_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path="./Data/testscript.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		int count = wb.getSheet("invalid Login").getLastRowNum();
		for (int i = 1; i <=count; i++) {
			String un = wb.getSheet("Invalid Login").getRow(i).getCell(0).getStringCellValue();
			String pwd = wb.getSheet("Invalid Login").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+" "+pwd);
			//System.out.println(un+"\t"+pwd);
		}
	}

}
