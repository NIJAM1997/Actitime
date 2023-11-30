package Mock_2_Questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_To_FireFlink_With_Property_Data {

	public static void main(String[] args) throws Exception {

		String path="./Data/qsp.property";
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("URL");
		String un = p.getProperty("USERNAME");
		String pwd = p.getProperty("PASSWORD");
		//System.out.println(url);
		//System.out.println(un);
		//System.out.println(pwd);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get(url);
		driver.findElement(By.name("emailId")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	}

}
