package ui_verification_commands.getText;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Element_Text {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * UserStory:-->
		 * 		As a User i can search flight with invalid details so that system
		 * 			may give response at error..
		 * 
		 * 	
		 * 		As a  -----  I do  ---So That -----
		 * 
		 * 
		 * Scenario:--> Verifying invalid flight search functionality
		 * 
		 * 		Given site url is http://cleartrip.com
		 * 		When user leave all mandatory fields empty
		 * 		Then click on Flight search button
		 * 		Then Applicaton display error message as  "Some Text -----!"
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		
		WebElement Search_button=driver.findElement(By.xpath("//input[@id='SearchBtn']"));
		Search_button.click();
		Thread.sleep(5000);  //Static timeout load error message
		
		
		String Exp_errmsg="Sorry, but we can't continue until you fix everything that's marked in RED";
		
		//Identify Error location
		WebElement Error_location=driver.findElement(By.xpath("//div[contains(@id,'homeErrorMessage')]"));
		String Act_errmsg=Error_location.getText();
		
		//Condition to verify text available at location
		if(!Act_errmsg.isEmpty()) //!--not
		{
			
			//Verify Expected text with acutal text
			if(Act_errmsg.equals(Exp_errmsg))
				System.out.println("Expected error msg dispalyed");
			else
				System.out.println("Wrong error msg displayed");
			
		}
		else
		{
			System.out.println("Element doesn't contain text");
		}
		

	}

}
