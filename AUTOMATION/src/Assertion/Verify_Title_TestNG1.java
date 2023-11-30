package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verify_Title_TestNG1 {

	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String aTitle = driver.getTitle();
		String eTitle = "Soogle";
		SoftAssert s=new SoftAssert();
		s.assertEquals(aTitle, eTitle);
		driver.close();
		s.assertAll();
	}
}
