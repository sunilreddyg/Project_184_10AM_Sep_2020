package launch_browsers;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge_Browser {

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> WebDriver can't access real browsers, Inorder to automate
		 * 			browser we need to download Browser Drivers.
		 * 
		 * 		URL:--> https://msedgewebdriverstorage.z22.web.core.windows.net/
		 * 				Download w.r.t edgebrowser version
		 * 				Click on Any EdgeDriver Version   85.0
		 * 				Downlaod Zip formati file w.r.t Hotspot size
		 * 				Unzip file to local drive, It Receive msedgedriver.exe file
		 * 				Copy .exe file to project folder
		 * 				Set Runtime environment variable before launch EdgeBrowser.
		 */
		
		System.setProperty("webdriver.edge.driver", "Drivers\\msedgedriver.exe");
		EdgeDriver edge=new EdgeDriver();
		edge.get("http://gmail.com");

	}

}
