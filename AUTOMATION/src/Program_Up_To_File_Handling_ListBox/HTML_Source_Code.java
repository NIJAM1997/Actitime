package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_Source_Code {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String htmlcode=driver.getPageSource();
		//OR System.out.println(driver.getPageSource());
		System.out.println(htmlcode);
		driver.close();

	}

}
