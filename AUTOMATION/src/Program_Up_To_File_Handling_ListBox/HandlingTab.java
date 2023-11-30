package Program_Up_To_File_Handling_ListBox;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTab {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allwh = driver.getWindowHandles();
		int count = allwh.size();
		System.out.println(count);
		for (String wh : allwh) {
			System.out.println(wh);
		}
		driver.quit();
	}

}
