package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Action 
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement For_Employee_login_Menu=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'For Employers')]"));
		//Perform Hover action on Location
		new Actions(driver).moveToElement(For_Employee_login_Menu).perform();
		Thread.sleep(3000);
		
		
		WebElement Employee_login_Menu_item=driver.findElement(By.xpath("//a[contains(@title,'Employer Login')]"));
		//With Mouse interactions perform click..
		new Actions(driver).click(Employee_login_Menu_item).perform();
		
		
		
		
		
		
	}

}
