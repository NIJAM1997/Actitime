package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'5')]"));
		Actions a=new Actions(driver);
		a.doubleClick(button).perform();
		boolean text = driver.findElement(By.xpath("//span[contains(text(),'You selected \"5\"')]")).isDisplayed();
	if (text==true) {
		System.out.println("Text is Displayed and Pass");
	} else {
		System.out.println("Text is Not Displayed and Fail");
	}
	driver.quit();
	}

}
