package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	/**
	 * This is Generic Method Reading the Data from Property File
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getProperty(String key) throws IOException
	{
		FileInputStream fis =new FileInputStream("./Data/qsp.property");
		Properties p=new Properties();
		p.load(fis);
		 String data = p.getProperty(key);
		return data;
		
	}
	/**
	 * This is Generic Method Reading the Data from Excel File
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws IOException
	 */
	public String getExcelData(String sheetName, int row, int cell) throws IOException
	{
		FileInputStream fis =new FileInputStream("./Data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
		
	}
	/**
	 * This is Generic Method Writing the Data into the Excel File
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param data1
	 * @throws IOException
	 */
	public void setExcelData(String sheetName, int row, int cell, String data1) throws IOException
	{
		FileInputStream fis =new FileInputStream("./Data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data1);
		FileOutputStream fos=new FileOutputStream("./Data/testscript.xlsx");
		wb.write(fos);		
	}

}
