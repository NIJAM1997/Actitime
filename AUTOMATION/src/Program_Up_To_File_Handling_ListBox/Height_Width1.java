package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Height_Width1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int height = driver.findElement(By.id("username")).getSize().getHeight();
		int width = driver.findElement(By.id("username")).getSize().getWidth();
		System.out.println(height);
		System.out.println(width);
		driver.close();
		
	}

}
