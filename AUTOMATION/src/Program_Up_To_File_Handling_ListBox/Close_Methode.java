package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Methode {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().deleteAllCookies();
		driver.close();

	}

}
