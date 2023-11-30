package Program_Up_To_File_Handling_ListBox;

import java.sql.Driver;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOption_Without_Duplicate {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/HOTELS.html");
		WebElement all = driver.findElement(By.id("MTR HOTEL"));
		Select s=new Select(all);
		HashSet<String>hs=new HashSet();
		List<WebElement> allop = s.getOptions();
		int count = allop.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text=allop.get(i).getText();
			hs.add(text);
		}
		for(String alltext:hs)
		{
			System.out.println(alltext);
		}


			}
}
