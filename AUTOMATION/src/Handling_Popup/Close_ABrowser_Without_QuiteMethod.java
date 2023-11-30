package Handling_Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_ABrowser_Without_QuiteMethod {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("login-google-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("apple-signin-button")).click();
		Thread.sleep(2000);
		Set<String> allwh = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String s : allwh) {
			driver.switchTo().window(s);
			driver.close();
		}
		
	}

}
