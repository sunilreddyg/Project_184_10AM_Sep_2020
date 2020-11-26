package wait_commands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Element_Visibility_And_HIdden_Status {

	public static void main(String[] args) throws Exception {
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
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
		WebElement Airlines=driver.findElement(By.xpath("//input[@name='airline']"));
		
		wait.until(ExpectedConditions.visibilityOf(Travel_Class));
		System.out.println("As expected travel class is visible at webpage");
		
		
		
				
	}

}
