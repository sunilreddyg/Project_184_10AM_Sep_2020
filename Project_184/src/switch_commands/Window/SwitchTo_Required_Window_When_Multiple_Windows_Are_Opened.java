package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Required_Window_When_Multiple_Windows_Are_Opened 
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
	    driver.manage().window().maximize();
	    
	    
	    String Mainwindow=driver.getWindowHandle();
	    
	    
	    //Click on Hyper link [It open in New TAB/Window]
	    driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/pnr']")).click();
	    Thread.sleep(2000);
	    
	    //Click on Hyper link [It open in New TAB/Window]
	    driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/calendar']")).click();
	    Thread.sleep(2000);
	    
	    //Click on Hyper link [It open in New TAB/Window]
	    driver.findElement(By.xpath("//a[contains(@href,'cancellation.shtml#cancel')]")).click();
	    Thread.sleep(2000);
	    
	    //Click on Hyper link [It open in New TAB/Window]
	    driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/offers/india/irctc-packages']")).click();
	    Thread.sleep(2000);
	    
	    
	    //Get All windows ID's
	    Set<String> All_windowIDS=driver.getWindowHandles();
		//Foreach loop to iterate number of window times
	    for (String EachWindow : All_windowIDS) 
	    {
			driver.switchTo().window(EachWindow);
			
			//Capture Title of Page
			String Runtime_title=driver.getTitle();
			
			//Condition to verify Expected page title
			if(Runtime_title.contains("Cancel Train Bookings"))
			{
				break;  //It keep controls on window where Title matches
			}
		}
	    
	    
	    System.out.println("Current focused window title is ---> "+driver.getTitle());
	    
	    
	    
	    
	    
	    
	}

}
