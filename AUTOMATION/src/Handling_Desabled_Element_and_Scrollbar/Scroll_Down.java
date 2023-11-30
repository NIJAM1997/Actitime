package Handling_Desabled_Element_and_Scrollbar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Down {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/news");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Scroll to Top of the Web Pagge
		//j.executeScript("window.scrollTo(0,0)");

	}

}
