package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Locator {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(3000);
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/Demo.html");
		Thread.sleep(3000);
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.id("d1")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.name("n1")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.className("c1")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
	}

}
