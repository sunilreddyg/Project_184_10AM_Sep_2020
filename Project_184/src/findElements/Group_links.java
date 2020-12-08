package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);  //Static time to close advertise window..
		
		
		
		//Before get group elements identify Footer Area
		WebElement Footer_Area=driver.findElement(By.cssSelector("ul[class='inline clearFix']"));
		
		//Find list of objects under footerarea
		List<WebElement> Footer_links=Footer_Area.findElements(By.tagName("a"));
		System.out.println("Number of footer links available is --> "+Footer_links.size());
		
		//Iterate for numeber of links
		for (int i = 0; i < Footer_links.size(); i++) 
		{
			//Get Each Object from list using Index number
			WebElement Eachlink=Footer_links.get(i);
			
			System.out.println(Eachlink.getText());
			System.out.println(Eachlink.getAttribute("href"));
			System.out.println("\n");  //Create New line at console
			
			//Clicking Eachlink
			Eachlink.click();
			Thread.sleep(2000);
			
			
			driver.navigate().back();   //It takes to previous page
			Thread.sleep(2000);
			
			//Restore all page references to avoid staleElement Reference exception.
			Footer_Area=driver.findElement(By.cssSelector("ul[class='inline clearFix']"));
			Footer_links=Footer_Area.findElements(By.tagName("a"));
		}
		
		
		
		
		/*
		 * StaleElementReferenceException:-->
		 * 			WebDriver throw this exception when Variable information was expired.
		 * 		How Variable information expired?
		 * 			=> If Element identified at particular page the variable store
		 * 				information of page aswell, when Page get changed because of
		 * 				any reason that identified element expires from curren page.
		 */
		
	}

}
