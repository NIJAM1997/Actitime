package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Remove_Text {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.Opensourcebilling.org/");
		driver.findElement(By.id("email")).clear();
		driver.close();
		
				
	}

}
