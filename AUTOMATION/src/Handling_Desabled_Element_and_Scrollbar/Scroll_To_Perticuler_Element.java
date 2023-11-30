package Handling_Desabled_Element_and_Scrollbar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_To_Perticuler_Element {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/news");
		int y = driver.findElement(By.xpath("//h2[text()='Around the BBC']")).getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,"+y+")");
	}

}
