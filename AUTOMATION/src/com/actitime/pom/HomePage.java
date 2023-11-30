package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText="Logout")
	private WebElement lgoutbtn;
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement tskbtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setTask() {
		tskbtn.click();
	}
	
	public void setLogout()
	{
		lgoutbtn.click();
	}
}
