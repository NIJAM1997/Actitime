package Mock_2_Questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class dataDrivenTesting {

	public static void main(String[] args) throws Exception {

		String path="./Data/qsp.property";
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("URL");
		String un = p.getProperty("USERNAME");
		String pwd = p.getProperty("PASSWORD");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
	}

}
