package Mouse_Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Mouse_Hover {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.vtiger.com/");
		WebElement target = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(target);
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String phone = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
		System.out.println(phone);
		driver.close();
	}

}
