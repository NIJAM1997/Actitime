package Handling_Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Print_Popup_in_Chrome {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.royalchallengers.com/");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		Set<String> allwid = driver.getWindowHandles();
		for (String wid : allwid) {
			driver.switchTo().window(wid);
		}
		SearchContext tree1 = driver.findElement(By.tagName("print-preview-app")).getShadowRoot();
		SearchContext tree2 = tree1.findElement(By.id("sidebar")).getShadowRoot();
		SearchContext tree3 = tree2.findElement(By.cssSelector("print-preview-button-strip")).getShadowRoot();
		tree3.findElement(By.cssSelector("cr-button[class='action-button']")).click();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_X);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.close();
	}

}
