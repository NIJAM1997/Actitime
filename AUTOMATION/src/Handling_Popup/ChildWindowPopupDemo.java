package Handling_Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopupDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		Thread.sleep(3000);
		String wh = driver.getWindowHandle();
		Thread.sleep(3000);
		System.out.println(wh);
	}

}
