package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys_Using_Keyboard_Interactions {

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  						//Launch browser
		driver.get("https://www.naukri.com/free-job-alerts");  		//Load webpage
		driver.manage().window().maximize(); 					 	//maximize browser window
		Thread.sleep(5000);
		
		
		//Click to open list of options	
		driver.findElement(By.id("cjaExp")).click();
		
		
		new Actions(driver)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(1000)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(1000)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(1000)
		.sendKeys(Keys.ENTER)
		.perform();
		
		
		
		WebElement Location=driver.findElement(By.xpath("//input[@id='Sug_locsugg']"));
		new Actions(driver)
		.sendKeys(Location, "HYD")
		.pause(2000)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(2000)
		.sendKeys(Keys.ENTER)
		.perform();
		
		
		
		//Perform pagedown operation
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
		
		
		//GetBack to Mainpage
		new Actions(driver).sendKeys(Keys.HOME).perform();

	}

}
