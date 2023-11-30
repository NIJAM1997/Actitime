package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alternate_Frame {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/page1.html");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.id("t2")).sendKeys("AKMAL");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("NIJAM");
		WebElement target = driver.findElement(By.xpath("//iframe"));
		Thread.sleep(3000);
		driver.switchTo().frame(target);
		driver.findElement(By.id("t2")).sendKeys("NIJAM");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("AKMAL");
		
		
	}

}
