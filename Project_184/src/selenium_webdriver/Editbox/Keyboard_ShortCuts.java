package selenium_webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_ShortCuts 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		//Select dropdown day and press 15 keyboard sequence
		driver.findElement(By.id("day")).sendKeys("15");

		//Identify Dropdown Month and Press ArrowDown For Twice
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		
		/*
		 * Note:--> Real dropdown to select selenium have different commands
		 * 			don't follow Keybaord shortcuts..
		 */
	}

}
