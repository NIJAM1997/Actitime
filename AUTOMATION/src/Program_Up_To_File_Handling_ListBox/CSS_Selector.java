package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(3000);
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/Demo.html");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href='https://www.jspiders.com']")).click();
	}

}
