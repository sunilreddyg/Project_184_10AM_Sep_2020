package wait_commands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedConditions_Without_WebDriverWait {

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");  
		driver.manage().window().maximize(); 
		
		
		String page_title="SeleniumHQ Browser Automation";
		
		//Conditions with webdriverwait commands
		new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs(page_title));
		
		//Conditions without webdriverwait..
		boolean flag=ExpectedConditions.titleIs(page_title).apply(driver);
		System.out.println("Selenium homepage title status is ---> "+flag);
		
		
		//Note:--> When we implement expectedconditions without webdriver wait
		//We must add apply method at end of statement..
		

	}

}
