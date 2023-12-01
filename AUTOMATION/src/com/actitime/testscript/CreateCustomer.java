package com.actitime.testscript;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;

@Listeners(com.actitime.generic.Listnerimplimentation.class)
public class CreateCustomer extends BaseClass{

	FileLib f=new FileLib();
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("Customer Created", true);
		HomePage h=new HomePage(driver);
		Thread.sleep(2000);
		h.setTask();
		TaskPage t=new TaskPage(driver);
		Thread.sleep(2000);
		t.setAddNew();
		Thread.sleep(2000);
		t.setNewCustomer();
		Thread.sleep(2000);
		t.setEnterCustomerName(f.getExcelData("CreateCustomer", 1, 2));
		Thread.sleep(2000);
		t.setDiscription(f.getExcelData("CreateCustomer", 1, 3));
		Thread.sleep(2000);
		t.setImportDropdown();
		Thread.sleep(2000);
		t.setOurComapany();
		Thread.sleep(2000);
		t.setCreateCustomer();
		Thread.sleep(2000);
		t.setAddNew();
		Thread.sleep(2000);
		t.setNewProject();
		Thread.sleep(2000);
		t.setEnterProjectName(f.getExcelData("CreateCustomer", 2, 2));
		Thread.sleep(2000);
		t.setCustomerDropdown();
		Thread.sleep(2000);
		t.setSelectCustomer();
		Thread.sleep(2000);
		t.setprojectDiscription(f.getExcelData("CreateCustomer", 2, 3));
		t.setCreateButton();
		
	}
	
}
