package ui_verification_commands.Attribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_Attribute {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:  Verifying flight search  functioality
		 * 
		 * 		Given site url is http://makemytrip.com
		 * 		Then user start search flight by selection oneway trip type
		 * 		When user tap of return date 
		 * 		Then Trip selection should move from oneway to roundtrip
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);   //Static time given to close advertise window [Manually]
		
		
		WebElement Oneway_Triptype=driver.findElement(By.cssSelector("li[data-cy='oneWayTrip']"));
		String Runtime_class=Oneway_Triptype.getAttribute("class");
		
		if(Runtime_class.contains("selected"))
		{
			System.out.println("Oneway trip was  selected on browser launch");
			
			//Tap on Return date
			WebElement Return_Date=driver.findElement(By.xpath("//span[contains(.,'RETURN')]"));
			Return_Date.click();
			Thread.sleep(5000);
			
			//Then Verify Trip Type selection move to roundtrip
			WebElement Roundtrip_Triptype=driver.findElement(By.cssSelector("li[data-cy='roundTrip']"));
			if(Roundtrip_Triptype.getAttribute("class").equals("selected"))
				System.out.println("As expected selection moved to roundtrip after tap on return date ");
			else
				System.out.println("Tesfail, Roundtrip is not selected after tap on return date");
			
		}
		else
		{
			System.out.println("Oneway trip was not selected on browser launch");
		}
		
		
		
		
		
		

	}

}
