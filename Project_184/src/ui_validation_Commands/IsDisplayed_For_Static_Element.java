package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_For_Static_Element {

	public static void main(String[] args) 
	{
			//Locate chrome browser in currnet system
			System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();  	//Launch browser
			driver.get("https://www.outlook.com");  //Load webpage
			driver.manage().window().maximize();    //maximize browser window
									
		
			//Identify Signin button
			WebElement Signin_btn=driver.findElement(By.xpath("//a[text()='Sign in']"));
			
			if(Signin_btn.isDisplayed())
			{
				System.out.println("expected Element visible at webpage");
				Signin_btn.click();
			}
			else
				System.out.println("Signin button not visible at webpage");

			
			//identify Email location
			WebElement Email_EB=driver.findElement(By.id("i0116"));
			if(Email_EB.isDisplayed())
			{
				Email_EB.clear();
				Email_EB.sendKeys("sunilreddy.gajjala@outlook.com");

			}
			else
				System.out.println("Email editbox is not visible at webpage");
			
			
			

			/*
			 * ElementNotvisibleException   
			 * 			==> It Throws When user perform action on hidden element  
			 * InvalidElementstateException 
			 * 			==> It Throws When user perform action on disabled element
			 */
			
			
			
			
			

	}

}
