package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args)throws InterruptedException {
		Thread.sleep(3000);
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		
				

	}

}
