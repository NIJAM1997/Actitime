package Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule {
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("Login", true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout", true);
	}
	@Test(priority = 1)
	public void createModule()
	{
		Reporter.log("Create Module", true);
	}
	@Test(priority = 3, invocationCount = 3)
	public void deleteModule()
	{
		Reporter.log("Delete Module", true);
	}
	@Test(priority = 2,dependsOnMethods = "createModule")
	public void modifyModule()
	{
		Reporter.log("Modify Module", true);
	}
}
