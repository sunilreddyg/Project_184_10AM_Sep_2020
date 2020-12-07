package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_group_options {

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  							//Launch browser
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");  		//Load webpage
		driver.manage().window().maximize(); 							//maximize browser window
		
		
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		//Get List of options under statedropdown.
		List<WebElement> All_States=new Select(State_Dropdown).getOptions();
		
		
		for (int i = 0; i < All_States.size(); i++) 
		{
			WebElement Each_option=All_States.get(i);		  //This action retrieve each option from list of Options using increment.
			System.out.println("-->"+Each_option.getText());  //This action read name of Dropdow option
			Each_option.click(); 							  //This action click each options index wise
		}
				

	}

}
