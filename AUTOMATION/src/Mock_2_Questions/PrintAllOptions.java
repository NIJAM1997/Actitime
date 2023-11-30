package Mock_2_Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/HOTELS.html");
		WebElement hotellistbox = driver.findElement(By.id("MTR HOTEL"));
		Select s=new Select(hotellistbox);
		List<WebElement> alloption = s.getOptions();
		int count=alloption.size();
		System.out.println(count);
		for (WebElement all : alloption) {
			String text = all.getText();
			System.out.println(text);
		}
		driver.close();
	}
}
//for (int i = 0; i < count; i++) {
//	String text=alloption.get(i).getText();
//	System.out.println(text);
//}