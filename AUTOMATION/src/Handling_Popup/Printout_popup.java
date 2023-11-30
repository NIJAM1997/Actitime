package Handling_Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printout_popup {

	

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Robot r=new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_P);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		for (int i = 0; i <=5; i++) {
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_TAB);
		}
		
		for (int i = 0; i <=4; i++) {
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_DOWN);
		}
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_MINUS);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_4);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_B);
		Thread.sleep(2000);		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(5000);
	}	
		
}

