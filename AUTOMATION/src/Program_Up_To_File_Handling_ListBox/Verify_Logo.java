package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Logo {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if (logo==true) {
			System.out.println("Logo is Displayed and pass");
		} else {
			System.out.println("Logo is not Displayed And fail");

		}
		driver.close();
	}

}
