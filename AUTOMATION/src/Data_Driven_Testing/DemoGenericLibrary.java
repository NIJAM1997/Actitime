package Data_Driven_Testing;

import java.io.IOException;

public class DemoGenericLibrary {

	public static void main(String[] args) throws IOException {

		FileLib f=new FileLib();
		String url = f.getProperty("URL");
		String un = f.getProperty("USERNAME");
		String pwd = f.getProperty("PASSWORD");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		f.setExcelData("invalid Login",1 , 1,"Skipped");
		System.out.println(f.getExcelData("invalid Login", 1, 1));
				
	}

}
