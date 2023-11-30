package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_Pest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
	}

}