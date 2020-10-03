package selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Interface {

	public static void main(String[] args) 
	{
		
		//Locating chromedriver 
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //Launch browser
		driver.get("http://facebook.com");     //Load webpage
		
		
		/*
		 * Note:--> Here webdriver is Interface designed to manipulate 
		 * 			browser instances supported by selenium.
		 * 
		 * 		Adv:--> Support Crossbrowser automation. Which means
		 * 				we design code for one browser and automate
		 * 				for multiple browser.
		 */
		
		
		/*
		 * Exception:-->
		 * 			IllegalstateException
		 * 					=>Above exception display when Chromedriver.exe
		 * 					  file not create as system property.
		 * 		
		 * 			SessionNotCreate Exception
		 * 				   => When browser version and browserdriver version 
		 * 					  mismatch above exception will display..
		 * 
		 * 			InvalidArgumentException
		 * 				   => When protocal mismatch, We must
		 * 						use browser protocal [http:// or https://]
		 */
		
		
		
		
		
	}

}
