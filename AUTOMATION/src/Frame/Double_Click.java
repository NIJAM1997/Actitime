package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.vtiger.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.partialLinkText("Resources")).click();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement login = driver.findElement(By.id("loginspan"));
		Actions a=new Actions(driver);
		a.doubleClick(login).perform();
		String s="Login - Vtiger";
		String title = driver.getTitle();
		if (s.equals(title)) {
			System.out.println("Login Page is Displayed and pass");
		}
		else
		{
			System.out.println("Login Page is Not Displayed and fail");
		}
		driver.close();
	}

}
