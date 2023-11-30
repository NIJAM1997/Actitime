package Program_Up_To_File_Handling_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectedOption {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/HOTELS.html");
		WebElement hotellistbox = driver.findElement(By.id("MTR HOTEL"));
		Select s=new Select(hotellistbox);
		List<WebElement> allfsoption = s.getAllSelectedOptions();
		int count=allfsoption.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text=allfsoption.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}
	
}
