package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Link_Text_Actitime {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String text = driver.findElement(By.id("toPasswordRecoveryPageLink")).getText();
		System.out.println(text);
		driver.close();
	}
}
