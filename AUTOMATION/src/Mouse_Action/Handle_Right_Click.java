package Mouse_Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Right_Click {

	public static void main(String[] args) throws AWTException, InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.contextClick(link).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(5000);
		driver.quit();
		
	}

}
