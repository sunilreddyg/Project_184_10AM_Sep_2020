package chrome_options;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Adding_Plugins_To_Automation_Browser {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.addExtensions(new File("C:\\Users\\SUNIL\\Downloads\\extension_3_17_0_0.crx"));
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\git\\Project_184_10AM_Sep_2020\\Project_184\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://facebook.com");
		System.out.println("Site is up and ready to use..");

	}

}
