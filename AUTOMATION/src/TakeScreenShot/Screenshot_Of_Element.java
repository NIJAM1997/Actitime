package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Of_Element {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.royalchallengers.com/");
		WebElement ele = driver.findElement(By.xpath("//img[@src='/themes/custom/rcbbase/images/rcb-logo-new.png']"));
		Thread.sleep(4000);
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/img.png");
		FileUtils.copyFile(src, dest);
		driver.close();
	}

}
