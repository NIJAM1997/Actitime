package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.WebDriver;

public class DemoA {

	static void test(WebDriver driver)
	{
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
				
	}
}
