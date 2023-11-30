package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSinglelistBox {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/HOTELS.html");
		WebElement hotellistbox = driver.findElement(By.id("TAJ HOTEL"));
		Select s=new Select(hotellistbox);
		s.selectByIndex(1);
		s.selectByValue("B");
		s.selectByVisibleText("Kabab");
		boolean status=s.isMultiple();
		System.out.println(status);
	}

}
