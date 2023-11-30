package Frame;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Login_Successfully_displayed {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("username")).sendKeys("admin");
	
		driver.findElement(By.id("password")).sendKeys("manager");
	
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		if (text.equals("Logged in Successfully")) {
			System.out.println("Text is Visible and Pass");
		}
		else
		{
			System.out.println("Text is Not Visible and Fail");
		}
		a.accept();
		driver.close();
	}

}
