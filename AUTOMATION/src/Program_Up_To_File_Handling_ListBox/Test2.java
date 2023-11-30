package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.findElement(By.linkText("Google")).click();
	}

}
