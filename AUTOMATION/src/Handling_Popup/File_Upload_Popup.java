package Handling_Popup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Popup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/Upload%20Button.html");
		Thread.sleep(3000);
		File f=new File("./Data/Imran Updated CV.docx");
		Thread.sleep(3000);
		String abpath=f.getAbsolutePath();
		Thread.sleep(3000);
		driver.findElement(By.id("cv")).sendKeys(abpath);
		Thread.sleep(3000);
		driver.quit();
				
	}

}
