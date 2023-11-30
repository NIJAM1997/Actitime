package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Y_Axis {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int x1=driver.findElement(By.name("login")).getLocation().getX();
		int y1=driver.findElement(By.name("login")).getLocation().getY();
		System.out.println("X Axis- "+x1);
		System.out.println("Y Axis- "+y1);
		
}
}
