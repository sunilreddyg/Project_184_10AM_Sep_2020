package selenium_webdriver.Editbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoComplete_editbox_With_ImplicitWait {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		//Manage dynamic timegap to avoid nosuchElemnet exception
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		/*
		 *  => Implicit wait only enable timegap when Object not found at html source.
		 *  				[DOM-Doucment object model]
		 *  
		 *  => Once timeout enable it verify same object to identify in 500 milliseconds
		 *  			interval.
		 *  
		 *  => We can avoid thread.sleep using
		 *  => We can avoid NosuchElement Exception
		 */
		
		
		
		//Type HYD Request at DepartueCity
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		//Type DEL request at Arrival City
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		
		
		

	}

}
