package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allignment{

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int height = driver.findElement(By.id("username")).getLocation().getX();
		int width = driver.findElement(By.name("pwd")).getLocation().getX();
		if (height==width) {
			System.out.println("Username and Password Text Field Properly Alligned and Pass");
		} else {
			System.out.println("Username and Password Text Field Properly Not Alligned and Fail");
		}
		
		driver.close();

	}
}
