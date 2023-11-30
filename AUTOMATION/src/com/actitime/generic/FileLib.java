package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public String path="./data/actitime.xlsx";

	public String getpropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/actitime.property");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	public String getExcelData(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis =new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	
	public void setExcelData(String sheetname, int row, int cell, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis =new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();
	}
}
