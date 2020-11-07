package ui_verification_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Page_url {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//get Runtime page url
		String Act_url=driver.getCurrentUrl();
		System.out.println("Current window url is ---> "+Act_url);
		
		
		if(Act_url.contains("https://"))
		{
			System.out.println("SSL certified page");
		}
		else
		{
			System.out.println("Not a secured page");
		}
		
		
		
		//Condition to verify expected url presented at current window
		if(Act_url.contains("https://www.facebook.com/"))
		{
			System.out.println("Expected page url presented for facebook homepage");
			
			WebElement Messenger_link=driver.findElement(By.xpath("//a[@href='https://messenger.com/']"));
			Messenger_link.click();
			
			if(driver.getTitle().equals("https://www.messenger.com/"))
				System.out.println("Messenger page url verified");
			else
				System.out.println("Messenger page url not verified");
			
		}
		else
		{
			System.out.println("Url mismatch for Facebook homepage");
		}
		
		

	}

}
