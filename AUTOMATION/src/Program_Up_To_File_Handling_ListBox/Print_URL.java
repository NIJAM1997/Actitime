package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_URL {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String url1=driver.getCurrentUrl();
		if (url1.equals("https://www.selenium.dev/")) {
			System.out.println("URL is Successfully Navigating and Pass");
		}
		else
		{
			System.out.println("URL is Not Successfully Navigating and Fail");
		}
		driver.close();
	}
}
