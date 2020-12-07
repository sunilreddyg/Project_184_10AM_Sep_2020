package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class State_And_City_Verification_At_Dropdown 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  							//Launch browser
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");  		//Load webpage
		driver.manage().window().maximize(); 	                        //maximize browser window
		
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		//Get list of option tags under Select tag..
		List<WebElement> All_States=State_Dropdown.findElements(By.tagName("option"));
		
		
		String Exp_cities[]= 
			{
				"Please select state first",
				"South Andaman",
				"South Andaman",	
				"Anantapur",
				"East Siang",
				"Darrang",
				"Arwal",
				"Chandigarh"
			};

		

		for (int i = 0; i < 8; i++) 
		{
			WebElement Each_option=All_States.get(i);		  //This action retrieve each option from list of Options using increment.
			Each_option.click(); 							  //This action click each options index wise
			Thread.sleep(4000);
			
			//Identify City Location
			WebElement City_Dropdown=driver.findElement(By.id("customCity"));
			//Get text of all Cities
			String Act_Cities=City_Dropdown.getText();
			
			if(Act_Cities.contains(Exp_cities[i]))
			{
				System.out.println("for state "+Each_option.getText()+"\t"+"\t"+" City displayed ==> "+Exp_cities[i]);
			}
			else
			{
				System.out.println("for state "+Each_option.getText()+"\t"+"\t"+" City not displayed ");
			}
			
		}
		
		
		

	}

}
