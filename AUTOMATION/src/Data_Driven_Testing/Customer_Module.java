package Data_Driven_Testing;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer_Module {

	@Test(priority = 1, invocationCount = 3)
	public void createModule()
	{
		Reporter.log("Create Customer", true);
	}
	@Test(priority = 2, dependsOnMethods = "createModule")
	public void modifyModule() {
		Reporter.log("Modify Module", true);
	}
	@Test (priority = 3, dependsOnMethods = "createModule")
	public void deleteModule() {
		Reporter.log("Delete Module", true);
	}


}
