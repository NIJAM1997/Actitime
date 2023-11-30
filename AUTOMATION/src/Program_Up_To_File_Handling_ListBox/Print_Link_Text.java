package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Print_Link_Text {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		String href = driver.findElement(By.xpath("//a[text()='Forgotten account?']")).getAttribute("href");
		System.out.println(href);
		driver.close();
	}

}
