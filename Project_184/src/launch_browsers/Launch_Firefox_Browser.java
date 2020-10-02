package launch_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser {

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> WebDriver can't access real browsers, Inorder to automate
		 * 			browser we need to download Browser Drivers.
		 * 
		 * Downloading geckodriver.exe file for Firefox Browser.
		 * 
		 * 		URL --> https://github.com/mozilla/geckodriver/releases
		 * 		=> Select Geckodriver version w.r.t Firefox browser version
		 * 			[Follow v0.26.0 for  firefox browser version 60 and greater than]
		 * 		=> Download geckodriver [[geckodriver-v0.26.0-win64.zip]]
		 * 		=> After download completed unzip file, 
		 * 		=> After unzip you recieve geckodriver.exe file
		 * 		=> Copy file into project folder
		 * 		=> Create Runtime environment variable for geckodriver before launch firefox
		 */
		
		
		 System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		 FirefoxDriver firefox=new FirefoxDriver();
		 firefox.get("http://facebook.com");

	}

}
