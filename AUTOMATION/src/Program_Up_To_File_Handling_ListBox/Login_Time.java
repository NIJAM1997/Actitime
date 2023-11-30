package Program_Up_To_File_Handling_ListBox;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Time {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		try {
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Page is loaded Within Five Second And Pass");
		}
		catch (Exception e) {
			System.out.println("page is Not loaded Within Five Second nad Fail");
		}
		
	}

}
