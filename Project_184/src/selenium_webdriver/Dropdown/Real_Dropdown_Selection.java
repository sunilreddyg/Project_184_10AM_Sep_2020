package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Real_Dropdown_Selection {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		
		/*
		 * For Select tag Element we follow Below Syntax
		 * 
		 * 		new Select(WebElement).SelectByVisibleText("OptionName");
		 */
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("May");
		
		
		/*
		 * Selecting dropdown with click option..
		 * 		=> Copy Option Xpath Instead of Select Tag Element
		 */
		driver.findElement(By.xpath("//*[@id=\"year\"]/option[10]")).click();
		

	}

}
