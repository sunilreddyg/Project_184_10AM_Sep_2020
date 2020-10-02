package launch_browsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_IE_Browser {

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> WebDriver can't access real browsers, Inorder to automate
		 * 			browser we need to download Browser Drivers.
		 * 
		 * 		URL:--> https://www.selenium.dev/downloads/
		 * 			=> Under "The Internet Explorer Driver Server" 
		 * 			=> Click on  <<64 bit Windows IE>>, It download Zip format file
		 * 			=> Unzip file, And you recieve IEDriverServer.exe file
		 * 			=> Copu .exe file to project folder
		 * 			=> And Create Runtime Environment variable before launch of ie browser.
		 * 
		 * 		Additional Settings:-->
		 * 			=> Only support IE11 version
		 * 			=> Zoom Level should be 100
		 * 			=> All privacy ans Security setting should be disabled.
		 */
		
		System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://facebook.com");

	}

}
