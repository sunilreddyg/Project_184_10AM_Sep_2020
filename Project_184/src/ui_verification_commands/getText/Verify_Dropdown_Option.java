package ui_verification_commands.getText;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Option {

	public static void main(String[] args) throws Exception {
		
		/*
		 * UserStory:-->
		 * 		As a User i can select required month so that option
		 * 		will be populated at dropdown
		 * 
		 * 	
		 * 		As a  -----  I do  ---So That -----
		 * 
		 * 
		 * Scenario:--> Verifying Dropdown option Selection
		 * 
		 * 		Given site url is http://facebook.com
		 * 		Then Verify Dropdown Contains expected option
		 * 		When user Select dropdown
		 * 		Then option populated at dropdown.
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		
		WebElement Month_dropdown=driver.findElement(By.id("month"));
		String Month_Options=Month_dropdown.getText();
		System.out.println(Month_Options);
		
		
		if(Month_Options.contains("Aug"))
		{
			new Select(Month_dropdown).selectByVisibleText("Aug");
			Thread.sleep(4000);
			
			//This syntax capture populated value at dropdown
			String RuntimeOption=Month_dropdown.getAttribute("value");
			System.out.println("Option populated at dropdown is --> "+RuntimeOption);
			
			
			if(RuntimeOption.equals("Aug"))
				System.out.println("Selection option populated is --> "+RuntimeOption);
			else 
				System.out.println("Wrong option populated");
		}
		

	}

}
