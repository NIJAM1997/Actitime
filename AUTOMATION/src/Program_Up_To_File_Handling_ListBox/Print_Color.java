package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Color {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		String color = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
		System.out.println(color);
		driver.close();
				
	}

}