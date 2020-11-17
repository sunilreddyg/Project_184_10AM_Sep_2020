package interactions.Touch_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;

public class Perform_single_Tap_Action {

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  					//Launch browser
		driver.get("https://jqueryui.com/selectable/");  		//Load webpage
		driver.manage().window().maximize(); 					//maximize browser window
		
		//Switch to frame using index number
		driver.switchTo().frame(0);

		WebElement Ele1=driver.findElement(By.xpath("//li[contains(.,'Item 1')]"));
		new TouchActions(driver).singleTap(Ele1).perform();
	}

}
