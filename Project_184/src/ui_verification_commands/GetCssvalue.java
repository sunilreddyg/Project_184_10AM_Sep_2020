package ui_verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssvalue {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Sensex_tab=driver.findElement(By.xpath("//a[contains(@id,'InvestRec')]"));
	    Sensex_tab.click();
	    Thread.sleep(4000);
	    
	    
	    //Get Selected object background color using it's style name
	    String BG_color=Sensex_tab.getCssValue("background-color");
	    System.out.println("BackGround color in RGBA format --> "+BG_color);
	    
	    if(BG_color.equals("rgba(231, 120, 23, 1)"))
	    	System.out.println("Sensex tab is acive");
	    else
	    	System.out.println("Sensex is inactive..");
	    

	}

}
