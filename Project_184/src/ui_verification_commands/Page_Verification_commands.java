package ui_verification_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_commands {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		String Page_title=driver.getTitle();
		System.out.println("Homepage title is --> "+Page_title);
		
		String Page_url=driver.getCurrentUrl();
		System.out.println("Homepage url is ---> "+Page_url);
		
		String window_ID=driver.getWindowHandle();
		System.out.println("Runtime window is ---. "+window_ID);
		
		String Page_source=driver.getPageSource();
		//System.out.println(Page_source);
	}

}
