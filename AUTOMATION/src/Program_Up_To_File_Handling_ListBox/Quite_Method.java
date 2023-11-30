package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quite_Method {

	public static void main(String[] args) throws InterruptedException {
	Thread.sleep(3000);
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://google.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}

}
