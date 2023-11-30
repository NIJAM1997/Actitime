package Mock_2_Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Link {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement>alllinks=driver.findElements(By.xpath("//a"));
		int count =alllinks.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text=alllinks.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

}
