package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Switch
{
	static WebDriver driver;
	static String Mainwindow_ID;
	
	public Window_Switch(WebDriver driver) 
	{
		Window_Switch.driver=driver;
	}

	
	/*
	 * Reusable:--> You can call this method whenever you want to switch to Next window
	 * 				other than mainwindow..
	 */
	public static void SwitchTo_Next_Window()
	{
		 Mainwindow_ID=driver.getWindowHandle();
		 System.out.println("Facebook Homepage window id is --> "+Mainwindow_ID);
		    
		
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
		
	}
	
	/*
	 * Reusable:--> You can call this method whenever you want to switch back to mainwindow
	 * 				from child window
	 */
	
	public static void switch_back_to_mainwindow()
	{
		driver.switchTo().window(Mainwindow_ID);
	}
	
	
	
	/*
	 * Reusable:--> You can call this method whenever you want to switch to using
	 * 				page title
	 */
	public static void SwitchTo_Window_WIth_Title(String Page_title)
	{
		
		 Mainwindow_ID=driver.getWindowHandle();
		 System.out.println("Facebook Homepage window id is --> "+Mainwindow_ID);
		 
		 //Get All windows ID's
	    Set<String> All_windowIDS=driver.getWindowHandles();
		//Foreach loop to iterate number of window times
	    for (String EachWindow : All_windowIDS) 
	    {
			driver.switchTo().window(EachWindow);
			
			//Capture Title of Page
			String Runtime_title=driver.getTitle();
			
			//Condition to verify Expected page title
			if(Runtime_title.contains(Page_title))
			{
				break;  //It keep controls on window where Title matches
			}
		}
	}
	
	
	
	

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Next_window_link=driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]"));
	    Next_window_link.click();
	    
	    
	    SwitchTo_Next_Window();
	    System.out.println("sub window page title is --> "+driver.getTitle());

	    //Type Into Editbox at New Window
	    driver.findElement(By.xpath("//input[@id='gsc-i-id1']")).sendKeys("webdriver");
	    
	    
	    switch_back_to_mainwindow();
	    System.out.println("main window page title is --> "+driver.getTitle());
	}

}
