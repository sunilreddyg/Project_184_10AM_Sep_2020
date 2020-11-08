package ui_verification_commands.Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Selected_value {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * FAQ:--> Verify Dropdown Selected value populated at dropdown.
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://v1.hdfcbank.com/branch-atm-locator");
	    driver.manage().window().maximize();
	    
	    
	    WebElement State_Dropdown=driver.findElement(By.id("customState"));
	    new Select(State_Dropdown).selectByVisibleText("Telangana");
	    Thread.sleep(3000);
	    
	    
	    //Capture selected dropdown value
	    String Input_value=State_Dropdown.getAttribute("value");
	    System.out.println("At StateDropdown option populated is --> "+Input_value);
	    
	    
	    if(Input_value.equals("telangana"))
	    	System.out.println("Testpass, Dropdown Selected value");
	    else
	    	System.out.println("Testfail, Dropdown failed to selec option..");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
