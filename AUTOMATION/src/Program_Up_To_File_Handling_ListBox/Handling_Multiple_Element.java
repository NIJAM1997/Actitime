package Program_Up_To_File_Handling_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Element {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/Demo.html");
		List<WebElement>alllinks=driver.findElements(By.xpath("//a"));
		int count =alllinks.size();
		System.out.println(count);
		WebElement link=alllinks.get(0);
		String text=link.getText();
		System.out.println(text);
		driver.close();
	}

}