package Program_Up_To_File_Handling_ListBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DemoADriver {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		DemoA.test(driver);
		WebDriver driver1=new EdgeDriver();
		DemoA.test(driver1);
		
	}
}
