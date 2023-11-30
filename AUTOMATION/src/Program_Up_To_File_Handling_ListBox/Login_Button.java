package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login_Button {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean button = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		if (button==true) {
			System.out.println("Button is Enable and pass");
		} else {
			System.out.println("Button Is Not Enable and Fail");
		}
		driver.close();
	}
}

