package Scroll_Down;//Not Scroll Down To 4000 pixel

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown_400_pixel {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/news");
		
		Actions a=new Actions(driver);
		a.scrollByAmount(0,4000);
	}

}