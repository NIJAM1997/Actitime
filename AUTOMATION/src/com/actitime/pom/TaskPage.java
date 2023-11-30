package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement adnewbtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement nctrbtn;
	
	@FindBy(xpath="//input[@autocomplete='off']")
	private WebElement ectrbtn;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement dscrbtn;
	
	@FindBy(xpath="//button[@class='x-btn-text']")
	private WebElement impdropbtn;
	
	@FindBy(xpath="//a[text()='Our Company']")
	private WebElement Ourcmpbtn;
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement crcmrbtn;
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setAddNew()
	{
		adnewbtn.click();
	}
	
	public void setNewCustomer()
	{
		nctrbtn.click();
	}
	
	public void setEnterCustomerName(String CustomerName)
	{
		ectrbtn.sendKeys(CustomerName);
	}
	
	public void setDiscription(String CustomerDiscription)
	{
		dscrbtn.sendKeys(CustomerDiscription);
	}
	
	public void setImportDropdown()
	{
		impdropbtn.click();
	}
	
	public void setOurComapany()
	{
		Ourcmpbtn.click();
	}
	
	public void setCreateCustomer()
	{
		crcmrbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
}
