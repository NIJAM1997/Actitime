package Frame;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Signup_Successfully_Displayed {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Frames']")).click();		
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("email")).sendKeys("admin@qspider.com");
		driver.findElement(By.id("password")).sendKeys("manager");
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		if (text.equals("Signed Up Successfully")) {
			System.out.println("Signup Text is Successfully Displayed and Pass");
		} else {
			System.out.println("Signup Text is Successfully Not Displayed and Fail");

		}
		a.accept();
		driver.close();
	}

}
