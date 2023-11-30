package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size_Comparison {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		int y1 = driver.findElement(By.xpath("//label[text()='Female']")).getLocation().getY();
		
		int y2 = driver.findElement(By.xpath("//label[text()='Male']")).getLocation().getY();
		
		int y3 = driver.findElement(By.xpath("//label[text()='Custom']")).getLocation().getY();
		
		if (y1==y2 && y2==y3 && y3==y1) {
			System.out.println("All the Radio Button are Aligned properly and Pass");
		} else {
			System.out.println("All the Radio Button are Not Aligned properly and Fail");
		}
		driver.close();
	}
}
