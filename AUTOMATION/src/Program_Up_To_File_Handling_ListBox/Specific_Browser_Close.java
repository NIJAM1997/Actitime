package Program_Up_To_File_Handling_ListBox;//Specific Broswer not getting close

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specific_Browser_Clo {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Title");
		String aTitle=sc.nextLine();

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();			
		driver.findElement(By.id("apple-signin-button")).click();		
		Set<String> allwh = driver.getWindowHandles();
			 
		 for (String wh : allwh) {			 
			 driver.switchTo().window(wh);	
			 String pwh = driver.getWindowHandle();
			if(aTitle.contains(pwh)) {
				
				driver.close();
			}
	}

  }
}
