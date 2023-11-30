package Handling_Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Window_popup_All_Addredss {

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
		int count=allwh.size();
		Thread.sleep(2000);
		System.out.println(count);
		for (String s : allwh) {
			System.out.println(s);
		}
		driver.quit();
	}

}
