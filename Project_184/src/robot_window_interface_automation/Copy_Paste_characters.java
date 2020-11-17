package robot_window_interface_automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Copy_Paste_characters {

	public static void main(String[] args) throws Exception 
	{
		
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		
		
		String text="Selenium automates browsers. That's it What you do with that power is entirely up to you.";
		StringSelection Stext=new StringSelection(text);
		
		//Get Access of RUntime clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		
		//Add Selected content to Clipboard
		clipboard.setContents(Stext, Stext);

		
		//Create object for robot class..
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Press Cntrl+V 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release down key control..
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		//Press Ctrl+S to save notepad file
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		
		
		
		
		StringSelection Spath=new StringSelection("C:\\Users\\SUNIL\\git\\Project_184_10AM_Sep_2020\\Project_184\\src\\robot_window_interface_automation\\IP.txt");
		clipboard.setContents(Spath, Spath);
		
		//Press Cntrl+V 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release down key control..
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
