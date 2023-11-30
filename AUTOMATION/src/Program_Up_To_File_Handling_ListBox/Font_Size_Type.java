package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Font_Size_Type {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		String font = driver.findElement(By.id("facebook")).getCssValue("font-size");
		String type = driver.findElement(By.id("facebook")).getCssValue("font-size");
		System.out.println(font);
		System.out.println(type);
		driver.close();
				
	}
}
