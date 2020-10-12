package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Selection_At_Dropdown 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 * FAQ:--> Only Select Multiple Selection options When Dropdown Return As
		 * 			Multiple Selection type..
		 */
		
		

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		/*
		 * Convert Single Option dropdown into Multiple Selection Dropdown Using
		 * JavaScript..
		 * Note:--> It's not a test engineer responsibility  [Don't try this]
		 */
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		//Verify Dropdown is single option or multiple option selection type
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		
		
		//Decision to accept on multiple selection type..
		if(flag==true)
		{
			System.out.println("Dropdown is multiple selection type");
			Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
			State_Dropdown.selectByIndex(3);
			State_Dropdown.selectByIndex(5);
			State_Dropdown.selectByIndex(7);
			
			int Count=State_Dropdown.getAllSelectedOptions().size();
			if(Count > 1)
			{
				System.out.println("Dropdown Selected Multiple Opitons");
			}
			else
			{
				System.out.println("Failed to select multiple options");
			}
			
			
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		
	
		
		
		Thread.sleep(4000);
		driver.close();   //Close Automation browse window
		
		

	}

}
