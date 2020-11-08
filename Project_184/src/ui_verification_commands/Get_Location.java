package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Sensex_tab=driver.findElement(By.xpath("//a[contains(@id,'InvestRec')]"));
	    
	    int Obj_x=Sensex_tab.getLocation().getX();
	    int OBj_y=Sensex_tab.getLocation().getY();
	    
	    System.out.println("Object X coordinates are --> "+Obj_x);
	    System.out.println("Object y coordinates are --> "+OBj_y);
	    
	    
	    /*
	     *  FAQ:-->How to verify object visbile at webapge using object coordinates
	     *  			[Coordinates return 0 when object hidden at webpage]
	     */
	    
	    
	    if(Obj_x > 0)
	    	System.out.println("Object visble at webpage");
	    else
	    	System.out.println("Object Hidden at webpage");
	    
	}

}
