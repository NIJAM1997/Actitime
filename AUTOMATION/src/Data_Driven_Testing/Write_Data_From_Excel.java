package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_Data_From_Excel {

	public static void main(String[] args) throws Throwable {
		String path="./Data/testscript.xlxs.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("Create Customer").getRow(2).getCell(1).setCellValue("Mohammed Akmal");
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();
	}

}
