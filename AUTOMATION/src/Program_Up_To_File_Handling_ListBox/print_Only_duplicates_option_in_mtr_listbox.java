package Program_Up_To_File_Handling_ListBox;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_Only_duplicates_option_in_mtr_listbox {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/HOTELS.html");
			WebElement all = driver.findElement(By.id("MTR HOTEL"));

			Select s=new Select(all);
			List<WebElement> allop = s.getOptions();
			int count = allop.size();
			System.out.println(count);
			HashSet<String> hs=new HashSet<String>();
			for(int i=0;i<count;i++)
			{
				String text = allop.get(i).getText();
				if(hs.add(text)==false)
				{
					System.out.println(text);
				}
			}
			driver.quit();

		}

}
