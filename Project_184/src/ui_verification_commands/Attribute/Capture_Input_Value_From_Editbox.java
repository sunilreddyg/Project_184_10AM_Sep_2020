package ui_verification_commands.Attribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Input_Value_From_Editbox 
{

	public static void main(String[] args) 
	{
		
		/*
		 * FAQ:--> How to capture typed characters at editbox..
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		WebElement Search_Textbox=driver.findElement(By.id("OutletSearch"));
		Search_Textbox.sendKeys("Gandhi nagar");
		
		//Get typed characters from editbox..
		String Input_Value=Search_Textbox.getAttribute("value");
		System.out.println("Editbox input value is ---> "+Input_Value);
	}

}
