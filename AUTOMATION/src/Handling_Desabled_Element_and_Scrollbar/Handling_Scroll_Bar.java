package Handling_Desabled_Element_and_Scrollbar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Scroll_Bar {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/news");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,3000)");
	}

}
