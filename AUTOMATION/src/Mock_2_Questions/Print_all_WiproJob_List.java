package Mock_2_Questions;//Printing Wrong Link

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_all_WiproJob_List {

	
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Wipro jobs");	
		driver.findElement(By.name("btnK")).click();
		List<WebElement> alllink = driver.findElements(By.xpath("//a[@jsname='UWckNb']"));	
		int count = alllink.size();
		System.out.println(count);
		for (WebElement all : alllink) {
			String url = all.getAttribute("href");
			System.out.println(url);
		}
	driver.close();
	}

}
