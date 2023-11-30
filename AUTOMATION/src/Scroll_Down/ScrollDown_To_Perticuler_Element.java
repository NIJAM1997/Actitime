package Scroll_Down;// NOt Moving the Courser to The Perticuler Elements

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown_To_Perticuler_Element {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/news");
		int y = driver.findElement(By.xpath("//h2[text()='Most watched']")).getLocation().getY();
		Actions a=new Actions(driver);
		a.moveToElement(y);
	}

}
