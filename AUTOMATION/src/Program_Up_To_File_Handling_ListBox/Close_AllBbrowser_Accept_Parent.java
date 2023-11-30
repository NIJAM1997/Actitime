package Program_Up_To_File_Handling_ListBox;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_AllBbrowser_Accept_Parent {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();	
		driver.findElement(By.id("apple-signin-button")).click();
		String pwh = driver.getWindowHandle();
		 Set<String> allwh = driver.getWindowHandles();
		 for (String wh : allwh) {
			 driver.switchTo().window(wh);
			if(wh.equals(pwh)) {
				
			}
			else
			{
				driver.close();
			}
		}
	}

}
