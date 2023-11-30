package Program_Up_To_File_Handling_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_Specific_Option {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NIJAM%20KOTWAL/OneDrive/Desktop/HOTELS.html");
		WebElement all = driver.findElement(By.id("MTR HOTEL"));
		Select s=new Select(all);
		List<WebElement> allopn = s.getOptions();
		int count = allopn.size();
		String specific="Poliyogre";
		int counter=0;
		for(int i=0;i<count;i++)
		{
			String text = allopn.get(i).getText();
			if(specific.equals(text))
			{
				counter++;
				break;
			}
			
		}
		System.out.println(counter);
		if(counter==1)
		{
			System.out.println("option is present");
		}
		else if(counter>1)
		{
			System.out.println("option is present but duplicate");
		}
		else 
		{
			System.out.println("option is not  present");
		}
		driver.quit();
}
}
