package Program_Up_To_File_Handling_ListBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_Suggetion {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Java");
		List<WebElement> alllink = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = alllink.size();
		for (int i = 0; i < count; i++) {
			String text = alllink.get(i).getText();
			System.out.println(text);
		}
	}

}
