package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {

	public static WebDriver driver;
public 	FileLib f=new FileLib();
	@BeforeTest
	public void openBrowser() throws IOException
	{
		Reporter.log("Open Browser",true);		
		driver=new ChromeDriver();
		driver.get(f.getpropertyData("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		Reporter.log("Login", true);		
		LoginPage l=new LoginPage(driver);
		Thread.sleep(4000);
		l.setLogin(f.getpropertyData("UN"), f.getpropertyData("PWD"));
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout", true);
		HomePage h=new HomePage(driver);
		h.setLogout();
	}
	@AfterTest
	public void closebroser()
	{
		Reporter.log("Close browser", true);
		driver.quit();
	}
}
