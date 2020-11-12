package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	    driver.manage().window().maximize();
	    
	    
	    String Mainwindow_ID=driver.getWindowHandle();
	    System.out.println("Facebook Homepage window id is --> "+Mainwindow_ID);
	    
	    
	    //Click Hyper link [Hyper link open page at new window]
	    driver.findElement(By.linkText("Instagram")).click();
	    
	    //Get All windowIDS
	    Set<String> All_WindowIDS=driver.getWindowHandles();
	    
	    //Apply foreach loop to iterate for number of windows
	    for (String EachWindowID : All_WindowIDS) 
	    {
			if(!Mainwindow_ID.equals(EachWindowID))  //!--NOT
			{
				driver.switchTo().window(EachWindowID);
				break;
			}
		}
	    
	    
	    System.out.println("Focused window title is ---> "+driver.getTitle());
	    
	    
	    Thread.sleep(5000);
	    WebElement Username=driver.findElement(By.name("username"));
	    Username.clear();
	    Username.sendKeys("darshan@gmail.com");
	   
	    
	    
	    //switch controls back to mainwindow...
	    driver.switchTo().window(Mainwindow_ID);
	    
	    
	    
	    Thread.sleep(2000);
	    WebElement Email=driver.findElement(By.id("email"));
	    Email.clear();
	    Email.sendKeys("qadarshan@gmail.com");
	    
	    
	    
	   
	    
	    
	    
	    
	    
	    
	    

	}

}
