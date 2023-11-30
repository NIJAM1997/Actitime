package Handling_Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender_Popup {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
	
}
}
