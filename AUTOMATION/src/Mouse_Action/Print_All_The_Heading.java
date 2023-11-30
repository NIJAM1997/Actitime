package Mouse_Action;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_The_Heading {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
		
		List<WebElement> alheading = driver.findElements(By.xpath("//h2"));
		driver.getWindowHandle();
		int count = alheading.size();
		System.out.println(count);
		
		driver.quit();
	}

}
