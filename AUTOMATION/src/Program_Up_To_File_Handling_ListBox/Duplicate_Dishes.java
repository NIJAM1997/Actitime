package Program_Up_To_File_Handling_ListBox;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicate_Dishes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/HOTELS.html");
		WebElement mtrlistbox = driver.findElement(By.id("TAJ HOTEL"));
		HashSet<String> hm=new HashSet();
		Select s=new Select(mtrlistbox);
		Thread.sleep(2000);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			if(hm.add(text)==false) {
				Thread.sleep(2000);
				System.out.println(text);
			}
		}
		driver.quit();
	}

}
