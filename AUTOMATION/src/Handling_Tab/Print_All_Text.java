package Handling_Tab;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_Text {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
		Set<String> allwh = driver.getWindowHandles();
		Iterator i=allwh.iterator();
		while (i.hasNext()) {
			String s=(String)i.next();
			driver.switchTo().window(s);
			String title = driver.getTitle();
			System.out.println(title);
			String s2="actiTIME Online Terms of Service";
			if (title.equals(s2)) {
				 List<WebElement> alltext = driver.findElements(By.xpath("//h2"));
				Iterator l=alltext.iterator();
				while (l.hasNext()) {
					WebElement w=(WebElement)l.next();
					String headings = w.getText();
					System.out.println(headings);
					
				}
			
			}
			if (title.equals(s2)) {
				driver.close();
			}
			if (!(title.equals(s2))) {
				driver.close();
			}
		}
		
	}

}
