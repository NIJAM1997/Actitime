package Program_Up_To_File_Handling_ListBox;//getting Socket Exception and Selecting element in Forword but deselecting in farword directing insted of reverse direction 

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Diselect_Reverse {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/HOTELS.html");
		Thread.sleep(2000);
		WebElement hotellistbox = driver.findElement(By.id("MTR HOTEL"));
		Select s=new Select(hotellistbox);
		List<WebElement> alloption = s.getOptions();
		int count=alloption.size();
		for (int i = 0; i<count; i++) {
			//Thread.sleep(2000);
			s.selectByIndex(i);
		}
		for (int i = count-1; i>=0 ; i--) {
			Thread.sleep(2000);
			s.deselectByIndex(i);
		}
		driver.quit();
	}
}
