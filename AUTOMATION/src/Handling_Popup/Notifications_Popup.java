package Handling_Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifications_Popup {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options =new ChromeOptions();
		Thread.sleep(3000);
		options.addArguments("--disable-notifications");
		Thread.sleep(3000);
		WebDriver driver=new ChromeDriver(options);
		Thread.sleep(3000);
		driver.get("https://www.yatra.com/");
	}

}
