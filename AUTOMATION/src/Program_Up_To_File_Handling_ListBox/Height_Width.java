package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Height_Width {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int height1=driver.findElement(By.id("username")).getSize().getHeight();
		int width1=driver.findElement(By.id("username")).getSize().getWidth();
		int height2=driver.findElement(By.name("pwd")).getSize().getHeight();
		int width2=driver.findElement(By.name("pwd")).getSize().getWidth();
		if (height1==height2 && width1==width2) {
			System.out.println("Height and Width of Username and Text feild and password Text field is Same and Pass");
		} else {
			System.out.println("Height and Width of Username and Text feild and password Text field is Not Same and Fail");
		}
	}
}
