package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(3000);
		EdgeDriver driver=new EdgeDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		String title=driver.getTitle();
		Thread.sleep(3000);
		System.out.println(title);
		Thread.sleep(3000);
		driver.close();
	}
}
