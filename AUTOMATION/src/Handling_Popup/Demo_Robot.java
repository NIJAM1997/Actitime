package Handling_Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Demo_Robot {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {

		Runtime.getRuntime().exec("notepad");
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Q);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_P);		
	}

}
