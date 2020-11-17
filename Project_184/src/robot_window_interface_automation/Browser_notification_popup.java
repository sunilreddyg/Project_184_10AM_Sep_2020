package robot_window_interface_automation;

import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_notification_popup {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      //Launch browser
		driver.get("http://cleartrip.com");       //load page to browser
		driver.manage().window().maximize();	  //Maximize browser window
		
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		robot.mouseMove(307, 166);
		
		//Press & release key..
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		
		robot.mouseMove(1264, 691);
		//Press & release key..
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
				
				
	}

}
