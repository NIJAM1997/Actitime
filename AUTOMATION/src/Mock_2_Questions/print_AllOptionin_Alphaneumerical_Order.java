package Mock_2_Questions;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_AllOptionin_Alphaneumerical_Order {

	public static void main(String[] args) {
	     WebDriver driver=new ChromeDriver();
	     driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/HOTELS.html");
	     WebElement all = driver.findElement(By.id("MTR HOTEL"));
	     Select s=new Select(all);
	     List<WebElement> allop = s.getOptions();
	     int count = allop.size();
	     System.out.println(count);
	     TreeSet<String> al=new TreeSet<String>();
	     for(int i=0;i<count;i++)
	     {
	    	 String text = allop.get(i).getText();
	    	 al.add(text);
	     }
	     for(String alltext:al)
	     {
	    	 System.out.println(alltext);
	     }
	     driver.quit();
		}
}
