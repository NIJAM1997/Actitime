package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Status {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
boolean checkbox = driver.findElement(By.id("keepLoggedInCheckBox")).isEnabled();
if (checkbox==true) {
	System.out.println("Check Box Enable And Pass");
} else {
	System.out.println("Check Box Not Enable and Fail");
}
	}

}
