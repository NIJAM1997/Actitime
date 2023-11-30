package Handling_Desabled_Element_and_Scrollbar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Open_The_Browser {

	public static void main(String[] args)  {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/disable1.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		RemoteWebDriver r=(RemoteWebDriver)driver;
		r.executeScript("document.getElementById('d2').value='manager'");
		//driver.findElement(By.id("d3")).click();
	}

}
