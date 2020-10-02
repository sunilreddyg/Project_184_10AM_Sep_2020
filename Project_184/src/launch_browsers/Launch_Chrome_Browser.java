package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Note:--> WebDriver can't access real browsers, Inorder to automate
		 * 			browser we need to download Browser Drivers.
		 * 
		 * 		URL --> https://chromedriver.chromium.org/downloads
		 * 				=> Download ChromeDriver w.r.t chrome browser version
		 * 				=> [If you are using Chrome version 85, please download ChromeDriver 85.0.4183.87]
		 * 				=> Select Operating System
		 * 				=> Click on Zipformat file,[It download file into local drive]
		 * 				=> Unzip file. When you unzip you receive chromedriver.exe file
		 * 				=> Create Runtime evironment variable before launching browser.
		 * 			
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://google.com");
		

	}

}
