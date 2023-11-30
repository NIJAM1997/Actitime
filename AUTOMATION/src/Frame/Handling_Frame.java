package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frame {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/page1.html");
		Thread.sleep(4000);
		driver.findElement(By.id("t1")).sendKeys("AKMAL");
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		driver.findElement(By.id("t2")).sendKeys("NIJAM");
		Thread.sleep(4000);
		driver.quit();
	}

}
