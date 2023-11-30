package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Single_List_Box {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		WebElement monthlistbox = driver.findElement(By.id("month"));
		Thread.sleep(3000);
		Select s=new Select(monthlistbox);
		s.selectByIndex(11);
		Thread.sleep(3000);
		s.selectByValue("2");
		Thread.sleep(3000);
		s.selectByVisibleText("Jun");
	}

}
