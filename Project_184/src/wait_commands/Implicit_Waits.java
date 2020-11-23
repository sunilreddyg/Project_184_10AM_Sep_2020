package wait_commands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Waits {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://cleartrip.com");
		driver.manage().window().maximize();
		System.out.println("BrowserLaunched");
		
		
		
		/*
		 * Here we assigned 50 seconds implicitwait to browser window, It mean
		 * it never throw exception immediatly when element not found at backend
		 * html source.
		 * 	=> This statement avoid nosuchelement exception when application
		 * 		having slow response.
		 */
		
		
		//set timegap until object load at DOM [Document Object model]
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//set timegap until page load at browser window.. 
		//[Selenium had default timeout if you want additional time to load foollow this command]
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		
		//Set timegap until asychronized source to load at page..
		driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
		
		
		
		
	}

}
