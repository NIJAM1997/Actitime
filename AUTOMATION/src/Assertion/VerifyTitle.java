package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyTitle {

	@Test
	public void verify()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String aTitle = driver.getTitle();
		String eTitle = "Google";
		if (aTitle.equals(eTitle)) {
			Reporter.log("Title Matching and Pass",true);
		}else {
			Reporter.log("Title Not Matching and fail", false);
		}
		driver.quit();
	}
}
