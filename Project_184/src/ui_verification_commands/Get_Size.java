package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
	    driver.manage().window().maximize();
	    
	    WebElement Sensex_tab=driver.findElement(By.xpath("//a[contains(@id,'InvestRec')]"));
	    
	    
	    int Obj_height=Sensex_tab.getSize().getHeight();
	    int Obj_width=Sensex_tab.getSize().getWidth();
	    
	    System.out.println("Object height is -->"+Obj_height );
	    System.out.println("Object width is --> "+Obj_width);
	    
	    
	    /*
	     * How to verify object visible at webpage using Dimensions
	     */
	    if(Obj_height > 0)
	    	System.out.println("Object is visible");
	    else
	    	System.out.println("Object is Hidden");
	}

}
