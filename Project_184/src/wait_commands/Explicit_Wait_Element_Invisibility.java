package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Element_Invisibility 
{

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.cleartrip.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		//Enable Explicit time at automation browser window
		WebDriverWait wait=new WebDriverWait(driver, 50);
	
		//target more options link
		WebElement More_options=driver.findElement(By.xpath("//a[@id='MoreOptionsLink']"));
		
		/*
		 * Click More options. Expected "Class of travel" and "Preffered
		 * airlines" element should visible at webpage..
		 */
		More_options.click();
		
		WebElement Travel_Class=driver.findElement(By.xpath(".//*[@id='Class']"));
		wait.until(ExpectedConditions.invisibilityOf(Travel_Class));
		System.out.println("As expected object is hidden at webpage");

	}

}
